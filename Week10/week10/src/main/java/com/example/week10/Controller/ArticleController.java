package com.example.week10.Controller;

import com.example.week10.Entity.Article;
import com.example.week10.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    // API to find all items
    @GetMapping("/")
    private List<Article> index(){
        return articleService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Article> search(@PathVariable("id") Integer id) {
        return articleService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private Article changeById(@PathVariable("id") Integer id, @RequestBody Article article) throws Exception {
        articleService.changeById(id, article);
        return article;
    }

    // API to create item
    @PostMapping
    private void insert(@RequestBody Article article) {
        articleService.save(article);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        articleService.deleteById(id);
    }
}
