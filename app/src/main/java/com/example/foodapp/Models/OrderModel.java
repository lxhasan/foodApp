package com.example.foodapp.Models;

public class OrderModel {

    int orderImage;
    String soldriTem , orderNumber, price;

    public OrderModel(int orderImage, String soldriTem, String orderNumber, String price) {
        this.orderImage = orderImage;
        this.soldriTem = soldriTem;
        this.orderNumber = orderNumber;
        this.price = price;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSoldriTem() {
        return soldriTem;
    }

    public void setSoldriTem(String soldriTem) {
        this.soldriTem = soldriTem;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
