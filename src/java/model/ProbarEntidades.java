/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-101
 */
public class ProbarEntidades {
    public static void main(String[] args) {
        try{
            //paso 1: Generar el session factory
        SessionFactory fuck=HibenateUtilidades.getSessionFactory();
        Session sesion = fuck.openSession();
        Transaction tranza=sesion.beginTransaction();
        //Ahora si veran lo que nunca en su vida han visto
        Usuario usuario = new Usuario("exitium", "exitium2015");
        sesion.save(usuario);
        tranza.commit();
        sesion.close();
            System.out.println("Usuario Guardado con exito");
        } catch(Exception e){
            
        }
    }
}
