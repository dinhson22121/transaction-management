package com.ds.transaction.order.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order-transactions")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int orderId;
    private int customerId;
    private int productId;
    private int quantity;
    private int price;

    public Order() {}
    public Order(int orderId, int customerId, int productId, int quantity, int price) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;


    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
