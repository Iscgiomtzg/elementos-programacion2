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
            DAOUsuario dao = new DAOUsuario();
           /* Usuario u = new Usuario("Gio","Patines");
                        dao.guardar(u);*/
            
          System.out.println("Transacción Exitosa:" + dao.buscarporId(1));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
