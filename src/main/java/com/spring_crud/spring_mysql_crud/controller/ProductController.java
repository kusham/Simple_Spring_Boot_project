package com.spring_crud.spring_mysql_crud.controller;

import com.spring_crud.spring_mysql_crud.entity.Product;
import com.spring_crud.spring_mysql_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/product")
    public void add(@RequestBody Product product){
        service.save(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAll();
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProduct(id);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
