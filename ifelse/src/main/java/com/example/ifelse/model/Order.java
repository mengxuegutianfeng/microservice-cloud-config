package com.example.ifelse.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private String source;

    private String payMethod;

    private String code;

    private BigDecimal amount;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
