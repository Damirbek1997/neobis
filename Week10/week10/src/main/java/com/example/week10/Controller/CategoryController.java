package com.example.week10.Controller;

import com.example.week10.Entity.Category;
import com.example.week10.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // API to find all items
    @GetMapping("/")
    private List<Category> index(){
        return categoryService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Category> search(@PathVariable("id") Integer id) {
        return categoryService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private Category changeById(@PathVariable("id") Integer id, @RequestBody Category category) throws Exception {
        categoryService.changeById(id, category);
        return category;
    }

    // API to create item
    @PostMapping
    private void insert(@RequestBody Category category) {
        categoryService.save(category);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        categoryService.deleteById(id);
    }
}
