/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.jsfbasico;

/**
 *
 * @author PC-Jesus
 */
public class Usuario {

    private String user;
    private String nickName;
    private String email;
    private String validationCode;

    public Usuario() {
    }

    public Usuario(String user, String nickName, String email, String validationCode) {
        this.user = user;
        this.nickName = nickName;
        this.email = email;
        this.validationCode = validationCode;
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
