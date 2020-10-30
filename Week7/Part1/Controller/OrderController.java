package com.example.demo.Controller;

import com.example.demo.Entity.Order;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    // API to find all items
    @GetMapping("/")
    private List<Order> index(){
        return orderService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Order> search(@PathVariable("id") Integer id) {
        return orderService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private Order changeById(@PathVariable("id") Integer id, @RequestBody Order order) throws Exception {
        orderService.changeById(id, order);
        return order;
    }

    // API to create item
    @PostMapping
    private void insert(@RequestBody Order order) {
        orderService.save(order);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        orderService.deleteById(id);
    }
}
