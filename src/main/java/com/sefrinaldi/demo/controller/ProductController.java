package com.sefrinaldi.demo.controller;

import com.sefrinaldi.demo.dto.ProductRequest;
import com.sefrinaldi.demo.entity.Product;
import com.sefrinaldi.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-service")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create-product")
    public Product createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @PutMapping("/edit-product")
    public Product updateProduct(@RequestBody ProductRequest productRequest) {
        return productService.editProduct(productRequest);
    }

    @GetMapping("/get-product/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/get-product")
    public List<Product> getAllProduct() {
        return productService.getProductAll();
    }
}
