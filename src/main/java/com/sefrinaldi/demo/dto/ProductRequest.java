package com.sefrinaldi.demo.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProductRequest {

    private String name;
    private LocalDateTime dob;
    private BigDecimal paymentAmount;
    private String productName;
}
