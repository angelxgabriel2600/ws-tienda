/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class JpaUtil {
    private static final EntityManagerFactory emf;
    static{
        try{
            emf=Persistence.createEntityManagerFactory("ws-tiendaPU");
        }catch(Throwable tr){
            System.err.print("Fallo creacion de Factory");
            throw new ExceptionInInitializerError(tr);
        }
    }

    /**
     * @return the emf
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
