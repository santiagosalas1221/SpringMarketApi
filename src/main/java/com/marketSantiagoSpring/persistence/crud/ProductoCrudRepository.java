package com.marketSantiagoSpring.persistence.crud;

import com.marketSantiagoSpring.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
