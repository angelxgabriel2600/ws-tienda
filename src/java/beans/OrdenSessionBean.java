/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.OrdenDao;
import entities.Cliente;
import entities.Orden;
import entities.Producto;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class OrdenSessionBean implements OrdenSessionBeanLocal {

    private OrdenDao dao=null;
    @Override
    public int agregarOrden(int idOrden, int idProducto,int idCliente,int cantidad) {
        Orden orden=new Orden( idCliente, idProducto, cantidad,new Date());
        dao=new OrdenDao(); 
        return dao.agregarOrden(orden);
    }

    @Override
    public int actualizarOrden(int idOrden, int idProducto,int idCliente,int cantidad) {
        Orden orden=new Orden(idOrden, idCliente, idProducto, cantidad, new Date());
        dao=new OrdenDao(); 
        return dao.actualizarOrden(orden);
    }

    @Override
    public int eliminarOrden(int idOrden) {
        dao=new OrdenDao(); 
        return dao.eliminarOrden(idOrden);
    }

    @Override
    public List<Orden> mostrarOrden() {
        dao=new OrdenDao();
        return dao.mostrarOrden();
    }

    @Override
    public Orden mostrarOrdenPorId(int idOrden) {
        dao=new OrdenDao();
        return dao.mostrarOrdenPorId(idOrden);
    }

    @Override
    public List<Cliente> mostrarCliente() {
        dao=new OrdenDao();
        return dao.mostrarCliente();
    }

    @Override
    public List<Producto> mostrarProducto() {
        dao=new OrdenDao();
        return dao.mostrarProducto();
    }
}
