/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Cliente;
import entities.Orden;
import entities.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import util.JpaUtil;

/**
 *
 * @author user
 */
public class OrdenDao {

    private EntityManager em = null;

    public int agregarOrden(Orden orden) {
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            em.persist(orden);
            return 1;
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al guardar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
            return 0;
        } finally {
            em.close();
        }
    }

    public int actualizarOrden(Orden orden) {
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            em.merge(orden);
            return 1;
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al modificar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
            return 0;
        } finally {
            em.close();
        }
    }

    public int eliminarOrden(int idOrden) {
        Orden orden = null;
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            orden = em.find(Orden.class, idOrden);
            em.remove(orden);
            return 1;
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al eliminar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
            return 0;
        } finally {
            em.close();
        }
    }

    public List<Orden> mostrarOrden() {
        List<Orden> lstOrden = null;
        Query query = null;
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT o FROM Orden o");
            lstOrden = query.getResultList();
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al eliminar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
        } finally {
            em.close();
        }
        return lstOrden;
    }

    public Orden mostrarOrdenPorId(int idOrden) {
        Orden orden = null;
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            orden = em.find(Orden.class, idOrden);
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al eliminar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
        } finally {
            em.close();
        }
        return orden;
    }

    public List<Cliente> mostrarCliente() {
        List<Cliente> lstCliente = null;
        Query query = null;
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT c FROM Cliente c");
            lstCliente = query.getResultList();
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al eliminar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
        } finally {
            em.close();
        }
        return lstCliente;
    }

    public List<Producto> mostrarProducto() {
        List<Producto> lstProducto = null;
        Query query = null;
        try {
            em = JpaUtil.getEntityManagerFactory().createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT p FROM Producto p");
            lstProducto = query.getResultList();
        } catch (Exception ex) {
            System.err.print("Ocurrio un error al eliminar orden");
            em.getTransaction().rollback();
            ex.printStackTrace();
        } finally {
            em.close();
        }
        return lstProducto;
    }
}
