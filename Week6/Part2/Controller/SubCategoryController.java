package com.example.demo.Controller;

import com.example.demo.Entity.SubCategory;
import com.example.demo.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subCategory")
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    // API to find all items
    @GetMapping("/")
    private List<SubCategory> index(){
        return subCategoryService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<SubCategory> search(@PathVariable("id") Integer id) {
        return subCategoryService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private SubCategory changeById(@PathVariable("id") Integer id, @RequestBody SubCategory subCategory) throws Exception {
        subCategoryService.changeById(id, subCategory);
        return subCategory;
    }

    // API to create item
    @PostMapping
    private void insert(@RequestBody SubCategory subCategory) {
        subCategoryService.save(subCategory);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@P("id") Integer id) {
        subCategoryService.deleteById(id);
    }
}
