package com.restTemplate.avgPrice.model;

import java.math.BigDecimal;

public class AveragePriceModel {
    private String mins;
    private BigDecimal price;
    private String symbol;

    public AveragePriceModel() {
    }

    public AveragePriceModel(String mins, BigDecimal price, String symbol) {
        this.mins = mins;
        this.price = price;
        this.symbol = symbol;
    }

    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
