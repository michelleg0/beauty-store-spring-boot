package com.example.beauty_store_spring_boot.controller;

import com.example.beauty_store_spring_boot.entity.Product;
import com.example.beauty_store_spring_boot.repository.ProductRepository;
import com.example.beauty_store_spring_boot.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    //Dependency injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //Returning a list of product objects
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }


    //Adding a new product
    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }


    //
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
    }
}


