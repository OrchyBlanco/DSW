/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.forvagos.dao;

import es.cifpcm.forvagos.pojos.Usuario;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author PC-Jesus
 */
public class UsuarioDAO {

    public void insertUsuario(Usuario u) {
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(u);
            tx.commit();
            sesion.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo guardar el usuario");
        }
    }
}
