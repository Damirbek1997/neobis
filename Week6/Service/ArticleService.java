package com.example.demo.Service;

import com.example.demo.Entity.Article;
import com.example.demo.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    // Method to save
    public void save(Article article) {
        articleRepository.save(article);
    }

    // Method to delete
    public void deleteById(Integer id) {
        articleRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    // Method to find by id
    public Optional<Article> findById(Integer id) {
        return articleRepository.findById(id);
    }

    // Method to change item by id
    public Article changeById (Integer id, Article article) throws Exception {
        return articleRepository.findById(id)
                .map(article1 -> {
                    article.setId(article.getId());
                    article.setTitle(article.getTitle());
                    article.setDescription(article.getDescription());
                    article.setProductId(article.getProductId());
                    article.setSubCategoryId(article.getSubCategoryId());
                    article.setCategoryId(article.getCategoryId());

                    return articleRepository.save(article);
                }).orElseThrow(Exception::new);
    }
}
