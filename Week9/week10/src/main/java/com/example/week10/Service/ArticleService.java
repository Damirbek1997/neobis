package com.example.week10.Service;

import com.example.week10.Entity.Article;
import com.example.week10.Repository.ArticleRepository;
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
    public Article changeById (Integer id, Article newArticle) throws Exception {
        return articleRepository.findById(id)
                .map(article -> {
                    article.setTitle(newArticle.getTitle());
                    article.setDescription(newArticle.getDescription());

                    return articleRepository.save(article);
                }).orElseThrow(Exception::new);
    }
}
