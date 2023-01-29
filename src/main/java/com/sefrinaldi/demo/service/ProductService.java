package com.sefrinaldi.demo.service;

import com.sefrinaldi.demo.dto.ProductRequest;
import com.sefrinaldi.demo.entity.Product;
import com.sefrinaldi.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .dob(LocalDateTime.now())
                .paymentAmount(productRequest.getPaymentAmount())
                .productName(productRequest.getProductName())
                .build();

        productRepository.save(product);
        return product;
    }

    public Product editProduct(ProductRequest productRequest) {

        Product product = productRepository.findByIdAndName(productRequest.getId(), productRequest.getName());

        Product newProduct = Product.builder()
                .id(product.getId())
                .name(product.getName())
                .dob(product.getDob())
                .paymentAmount(productRequest.getPaymentAmount())
                .productName(productRequest.getProductName())
                .build();

        productRepository.save(newProduct);
        return newProduct;
    }

    public Product getProductById(Long id) {

        Optional<Product> product = productRepository.findById(id);

        return product.get();
    }

    public List<Product> getProductAll() {
        return productRepository.findAll();
    }
}
