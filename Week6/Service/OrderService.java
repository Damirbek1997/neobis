package com.example.demo.Service;

import com.example.demo.Entity.Order;
import com.example.demo.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Order changeById (Integer id, Order order) throws Exception {
        return orderRepository.findById(id)
                .map(order1 -> {
                    order.setId(order.getId());
                    order.setUserEmail(order.getUserEmail());
                    order.setTotal(order.getTotal());
                    order.setOrderDate(order.getOrderDate());
                    order.setOrderProductId(order.getOrderProductId());
                    order.setCardId(order.getCardId());

                    return orderRepository.save(order);
                }).orElseThrow(Exception::new);
    }
}
