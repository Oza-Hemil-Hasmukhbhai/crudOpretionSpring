package com.javaCrud.springboot.controller;

import com.javaCrud.springboot.entity.Product;
import com.javaCrud.springboot.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServices services;

    @PostMapping("/add-product")
    public Product saveProduct(@RequestBody Product product){
        return  services.save(product);
    }

    @PostMapping("/add-products")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return services.saveProducts(products);
    }

    @GetMapping("/list")
    public List<Product> findAll(){
        return services.getProducts();
    }

    @GetMapping("/{id}")
    public Product findbyId(@PathVariable  int id){
        return services.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findbyId(@PathVariable String name){
        return services.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return  services.updateProductById(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return  services.deleteProductById(id);
    }

}
