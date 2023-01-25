package com.sefrinaldi.demo.service;

import com.sefrinaldi.demo.dto.ProductRequest;
import com.sefrinaldi.demo.entity.Product;
import com.sefrinaldi.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .dob(productRequest.getDob())
                .paymentAmount(productRequest.getPaymentAmount())
                .productName(productRequest.getProductName())
                .build();

        productRepository.save(product);
        return product;
    }
}
