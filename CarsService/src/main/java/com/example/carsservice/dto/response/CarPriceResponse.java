package com.example.carsservice.dto.response;

public class CarPriceResponse {
    private Integer price;

    public CarPriceResponse(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
