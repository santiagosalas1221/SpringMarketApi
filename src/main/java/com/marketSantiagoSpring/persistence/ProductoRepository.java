package com.marketSantiagoSpring.persistence;

import com.marketSantiagoSpring.persistence.crud.ProductoCrudRepository;
import com.marketSantiagoSpring.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    //Obtencion de todos los productos de una categoria y ordenados de forma ascendente
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }


    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    //Obtener producto por ID
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }


    //Guardar Producto
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }


    //Eliminar producto
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }

}
