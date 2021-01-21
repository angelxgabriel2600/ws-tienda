package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-20T12:27:26")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Date> fecha;
    public static volatile SingularAttribute<Orden, Integer> idCliente;
    public static volatile SingularAttribute<Orden, Integer> id;
    public static volatile SingularAttribute<Orden, Integer> idProducto;
    public static volatile SingularAttribute<Orden, Integer> cantidad;

}