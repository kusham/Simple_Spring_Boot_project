package com.spring_crud.spring_mysql_crud.repository;

import com.spring_crud.spring_mysql_crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
