/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import beans.OrdenSessionBeanLocal;
import entities.Cliente;
import entities.Orden;
import entities.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "OrdenWebService")
@Stateless()
public class OrdenWebService {

    @EJB
    private OrdenSessionBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "agregarOrden")
    public int agregarOrden(@WebParam(name = "idOrden") int idOrden, @WebParam(name = "idProducto") int idProducto, @WebParam(name = "idCliente") int idCliente, @WebParam(name = "cantidad") int cantidad) {
        return ejbRef.agregarOrden(idOrden, idProducto, idCliente, cantidad);
    }

    @WebMethod(operationName = "actualizarOrden")
    public int actualizarOrden(@WebParam(name = "idOrden") int idOrden, @WebParam(name = "idProducto") int idProducto, @WebParam(name = "idCliente") int idCliente, @WebParam(name = "cantidad") int cantidad) {
        return ejbRef.actualizarOrden(idOrden, idProducto, idCliente, cantidad);
    }

    @WebMethod(operationName = "eliminarOrden")
    public int eliminarOrden(@WebParam(name = "idOrden") int idOrden) {
        return ejbRef.eliminarOrden(idOrden);
    }

    @WebMethod(operationName = "mostrarOrden")
    public List<Orden> mostrarOrden() {
        return ejbRef.mostrarOrden();
    }

    @WebMethod(operationName = "mostrarOrdenPorId")
    public Orden mostrarOrdenPorId(@WebParam(name = "idOrden") int idOrden) {
        return ejbRef.mostrarOrdenPorId(idOrden);
    }

    @WebMethod(operationName = "mostrarCliente")
    public List<Cliente> mostrarCliente() {
        return ejbRef.mostrarCliente();
    }

    @WebMethod(operationName = "mostrarProducto")
    public List<Producto> mostrarProducto() {
        return ejbRef.mostrarProducto();
    }
    
}
