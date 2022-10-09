package com.spring_crud.spring_mysql_crud.service;

import com.spring_crud.spring_mysql_crud.entity.Product;
import com.spring_crud.spring_mysql_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
       return productRepository.save(product);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void delete(int id) {
        productRepository.deleteById(id);
    }

    public Product getProduct(int id) {
        return productRepository.findById(id).get();
    }
}
