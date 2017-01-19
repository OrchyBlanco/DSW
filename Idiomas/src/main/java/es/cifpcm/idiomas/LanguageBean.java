/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.idiomas;

import java.io.Serializable;
import javax.inject.Named;


import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
/**
 *
 * @author 2dawb
 */
@Named(value = "language")
@SessionScoped
public class LanguageBean implements Serializable{

    /**
     * Creates a new instance of LanguageBean
     */
    public LanguageBean() {
    }
    
}
