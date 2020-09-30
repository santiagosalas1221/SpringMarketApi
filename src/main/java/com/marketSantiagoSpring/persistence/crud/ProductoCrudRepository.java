package com.marketSantiagoSpring.persistence.crud;

import com.marketSantiagoSpring.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //QueryMethod
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
