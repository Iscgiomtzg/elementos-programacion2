/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T-101
 */
public class DAOUsuario {

    SessionFactory fuck;
    Session sesion;
    Transaction tranza;

    public DAOUsuario() {
        fuck = HibenateUtilidades.getSessionFactory();
        sesion = fuck.openSession();
        tranza = sesion.beginTransaction();
    }

    public void cerrarTransaccion() {
        sesion.close();
        tranza.commit();
    }

    //Primera operacion CRUD
    public void guardar(Usuario objeto) throws Exception {
        sesion.persist(objeto);
        cerrarTransaccion();
    }

    //Segunda operación CRUD
    public void actualizar(Usuario objeto) throws Exception {
        sesion.update(objeto);
        cerrarTransaccion();
    }

    //Tercer operación CRUD
    public void borrar(Usuario objeto) throws Exception {
        sesion.delete(objeto);
        cerrarTransaccion();
    }

    //Cuarta operación CRUD
    public Usuario buscarporId(Integer id) throws Exception {
        Usuario objeto = (Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTransaccion();
        return objeto;
    }

    //quita operación CRUD
    public ArrayList<Usuario> buscarTodos() throws Exception {
        ArrayList<Usuario> objetos = (ArrayList<Usuario>) sesion.createCriteria(Usuario.class).list();
        cerrarTransaccion();
        return objetos;
    }
}
