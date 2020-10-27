package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Method to save
    public void save(Product product) {
        productRepository.save(product);
    }

    // Method to delete
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Method to find by id
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    // Method to change item by id
    public Product changeById (Integer id, Product product) throws Exception {
        return productRepository.findById(id)
                .map(product1 -> {
                    product.setId(product.getId());
                    product.setName(product.getName());
                    product.setPrice(product.getPrice());
                    product.setAvailable(product.isAvailable());
                    product.setArticleId(product.getArticleId());
                    product.setSubCategoryId(product.getSubCategoryId());
                    product.setCategoryId(product.getCategoryId());

                    return productRepository.save(product);
                }).orElseThrow(Exception::new);
    }
}
