package com.javaCrud.springboot.services;

import com.javaCrud.springboot.entity.Product;
import com.javaCrud.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    //post
    public Product save(Product product) {
        return repository.save(product);
    }

    //list of save(post)
    public List<Product> saveProducts(List<Product> product) {
        return repository.saveAll(product);
    }

    //get
    public List<Product> getProducts() {
        return repository.findAll();
    }

    //get by id
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    //get by name
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    //delete
    public String deleteProductById(int id) {
          repository.deleteById(id);
          return "Product removed by:"+id;
    }

    //update by id
    public Product updateProductById(Product product) {
        Product existPr = repository.findById(product.getId()).orElse(null);
        existPr.setName(product.getName());
        existPr.setQty(product.getQty());
        existPr.setPrice(product.getPrice());
        return repository.save(existPr);
    }
}
