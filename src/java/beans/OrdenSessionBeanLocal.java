/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Cliente;
import entities.Orden;
import entities.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface OrdenSessionBeanLocal {
    public int agregarOrden(Orden orden);
    public int actualizarOrden(Orden orden);
    public int eliminarOrden(int idOrden);
    public List<Orden> mostrarOrden() ;
    public Orden mostrarOrdenPorId(int idOrden);
    public List<Cliente> mostrarCliente();
    public List<Producto> mostrarProducto();
}
