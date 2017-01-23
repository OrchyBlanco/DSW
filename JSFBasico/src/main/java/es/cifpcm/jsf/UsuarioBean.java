/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.cifpcm.jsfbasico.Usuario;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
/**
 *
 * @author PC-Jesus
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {

   
    private String code;
    private String user;
    private String nickName;
    private String email;
    private String validationCode;
    
    public UsuarioBean() {
        code="USUARIO-CODE";
        System.out.println("Validation code (Código de validación): "+code);
    }
    
    public String getValidation(){
        if ((validationCode != null) && (validationCode.compareTo(code) == 0)) {
        // The validationCode is OK then we show the user data in validation.xhtml
        // El código validationCode es correcto entonces mostramos los datos en validation.xhtm
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
        return "<p>User accepted:</p>"
                + "<ul>"
                + " <li>User: " + getUser() + " </li>"
                + " <li>Nick name: " + getNickName() + " </li>"
                + " <li>Email: " + getEmail() + " </li>"
                + "</ul>";
    } else {
        return "<p>Sorry, " + validationCode + " isn't valid.</p>"
                + "<p>Try again...</p>";
    }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }
    
    
}
