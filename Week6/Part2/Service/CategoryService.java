package com.example.demo.Service;

import com.example.demo.Entity.Category;
import com.example.demo.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // Method to save
    public void save(Category category) {
        categoryRepository.save(category);
    }

    // Method to delete
    public void deleteById(Integer id) {
        categoryRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    // Method to find by id
    public Optional<Category> findById(Integer id) {
        return categoryRepository.findById(id);
    }

    // Method to change item by id
    public Category changeById (Integer id, Category category) throws Exception {
        return categoryRepository.findById(id)
                .map(category1 -> {
                    category.setId(category.getId());
                    category.setName(category.getName());
                    category.setAvailable(category.isAvailable());

                    return categoryRepository.save(category);
                }).orElseThrow(Exception::new);
    }
}
