package com.marketSantiagoSpring.persistence;

import com.marketSantiagoSpring.domain.Product;
import com.marketSantiagoSpring.domain.repository.ProductRepository;
import com.marketSantiagoSpring.persistence.crud.ProductoCrudRepository;
import com.marketSantiagoSpring.persistence.entity.Producto;
import com.marketSantiagoSpring.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List <Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>> productos =  productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return  productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    //Guardar Producto
    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }


    //Eliminar producto
    @Override
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }

}
