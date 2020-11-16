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
    public Product changeById (Integer id, Product newProduct) throws Exception {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(newProduct.getName());
                    product.setPrice(newProduct.getPrice());
                    product.setAvailable(newProduct.isAvailable());
                    product.setOrder(newProduct.getOrder());
                    product.setArticles(newProduct.getArticles());
                    product.setSubCategory(newProduct.getSubCategory());
                    product.setCategory(newProduct.getCategory());

                    return productRepository.save(product);
                }).orElseThrow(Exception::new);
    }
}
