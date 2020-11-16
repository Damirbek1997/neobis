package com.example.demo.Service;

import com.example.demo.Entity.SubCategory;
import com.example.demo.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryService {
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    // Method to save
    public void save(SubCategory subCategory) {
        subCategoryRepository.save(subCategory);
    }

    // Method to delete
    public void deleteById(Integer id) {
        subCategoryRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<SubCategory> findAll() {
        return subCategoryRepository.findAll();
    }

    // Method to find by id
    public Optional<SubCategory> findById(Integer id) {
        return subCategoryRepository.findById(id);
    }

    // Method to change item by id
    public SubCategory changeById (Integer id, SubCategory newSubCategory) throws Exception {
        return subCategoryRepository.findById(id)
                .map(subCategory -> {
                    subCategory.setName(newSubCategory.getName());
                    subCategory.setAvailable(newSubCategory.isAvailable());
                    subCategory.setCategories(newSubCategory.getCategories());

                    return subCategoryRepository.save(subCategory);
                }).orElseThrow(Exception::new);
    }
}
