package com.javaCrud.springboot.repository;

import com.javaCrud.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
