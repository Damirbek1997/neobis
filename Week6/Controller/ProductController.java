package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;
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
    private List<Product> index(){
        return productService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Product> search(@PathVariable("id") Integer id) {
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
    private void insert(@RequestBody Product product) {
        productService.save(product);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        productService.deleteById(id);
    }
}
