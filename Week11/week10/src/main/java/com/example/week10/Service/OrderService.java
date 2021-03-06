package com.example.week10.Service;

import com.example.week10.Entity.Order;
import com.example.week10.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Method to save
    public void save(Order order) {
        orderRepository.save(order);
    }

    // Method to delete
    public void deleteById(Integer id) {
        orderRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    // Method to find by id
    public Optional<Order> findById(Integer id) {
        return orderRepository.findById(id);
    }

    // Method to change item by id
    public Order changeById (Integer id, Order newOrder) throws Exception {
        return orderRepository.findById(id)
                .map(order -> {
                    order.setUsername(newOrder.getUsername());
                    order.setTotal(newOrder.getTotal());
                    order.setOrderDate(newOrder.getOrderDate());
                    order.setProduct(newOrder.getProduct());

                    return orderRepository.save(order);
                }).orElseThrow(Exception::new);
    }
}
