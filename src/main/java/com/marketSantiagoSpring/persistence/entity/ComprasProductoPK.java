package com.marketSantiagoSpring.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * En esta clase se encuentran las clav es primarias para la tabla compras_producto, contiene llave primaria compuesta
 */
@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;


    @Column(name = "id_producto")
    private Integer idProducto;


    //Getter And Stters


    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
