package com.sefrinaldi.demo.repository;

import com.sefrinaldi.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByIdAndName(Long id, String name);
}
