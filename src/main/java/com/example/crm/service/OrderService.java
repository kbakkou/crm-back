package com.example.crm.service;

import com.example.crm.model.Order;
import com.example.crm.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public void save(Order order) {
        orderRepository.save(order);
    }

    public Order findById(Integer id) {
        return orderRepository.findById(id).get();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    public void update(Integer id, Order order) {
        orderRepository.save(order);
    }
}
