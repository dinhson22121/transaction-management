package com.ds.transaction.order.controller;

import com.ds.transaction.order.model.Order;
import com.ds.transaction.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(orderService.getAllOrders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOrderById(@PathVariable int id) {
        return ResponseEntity.ok().body(orderService.getOrderById(id));
    }
}
