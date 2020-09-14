package com.marketSantiagoSpring.persistence;

import com.marketSantiagoSpring.persistence.crud.ProductoCrudRepository;
import com.marketSantiagoSpring.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
