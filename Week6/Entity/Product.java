package com.example.demo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "is_available")
    private boolean isAvailable;

    @OneToMany
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    private List<Article> articleId;

    @OneToMany
    @JoinColumn(name = "sub_category_id")
    private List<SubCategory> subCategoryId;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Category> categoryId;

    public Product(String name, Integer price, boolean isAvailable, List<Article> articleId, List<SubCategory> subCategoryId, List<Category> categoryId) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.articleId = articleId;
        this.subCategoryId = subCategoryId;
        this.categoryId = categoryId;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Article> getArticleId() {
        return articleId;
    }

    public void setArticleId(List<Article> articleId) {
        this.articleId = articleId;
    }

    public List<SubCategory> getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(List<SubCategory> subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public List<Category> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Category> categoryId) {
        this.categoryId = categoryId;
    }
}
