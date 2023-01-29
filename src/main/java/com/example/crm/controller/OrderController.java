package com.example.crm.controller;

import com.example.crm.model.Order;
import com.example.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("")
    public List<Order> recupererOrders(){
        return orderService.findAll();
    }
    @PostMapping("")
    public void saveOrder(@RequestBody Order order){
        orderService.save(order);
    }
    @GetMapping("/{id}")
    public Order recupererOrderById(@PathVariable Integer id){
        return orderService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id){
        orderService.delete(id);
    }
    @PutMapping("/{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order){
        orderService.update(id, order);
    }
}
