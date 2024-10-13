package org.example.course.controller;

import org.example.course.entities.Product;
import org.example.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> productList = productService.findAll();
        return ResponseEntity.ok(productList);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Long id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }
}
