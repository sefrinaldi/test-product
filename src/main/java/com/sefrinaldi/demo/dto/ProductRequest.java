package com.sefrinaldi.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProductRequest {

    private Long id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String dob;
    private BigDecimal paymentAmount;
    private String productName;
}
