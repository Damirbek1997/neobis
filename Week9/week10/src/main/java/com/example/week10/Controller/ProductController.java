package com.example.week10.Controller;

import com.example.week10.Entity.Product;
import com.example.week10.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    // API to find all items
    @GetMapping("/")
    private List<Product> findAll(){
        return productService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Product> findById(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private Product changeById(@PathVariable("id") Integer id, @RequestBody Product product) throws Exception {
        productService.changeById(id, product);
        return product;
    }

    // API to create item
    @PostMapping
    private void createProduct(@RequestBody Product product) {
        productService.save(product);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void deleteById(@PathVariable("id") Integer id) {
        productService.deleteById(id);
    }
}
