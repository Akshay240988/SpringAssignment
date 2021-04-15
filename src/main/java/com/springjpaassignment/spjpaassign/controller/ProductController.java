package com.springjpaassignment.spjpaassign.controller;


import com.springjpaassignment.spjpaassign.model.Product;
import com.springjpaassignment.spjpaassign.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/saveProduct")
    private  String saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return "Product saved";
    }


}
