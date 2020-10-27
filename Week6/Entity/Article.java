package com.example.demo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "description", length = 100)
    private String description;

    @OneToMany
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private List<Product> productId;

    @OneToMany
    @JoinColumn(name = "sub_category_id", referencedColumnName = "id")
    private List<SubCategory> subCategoryId;

    @OneToMany
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private List<Category> categoryId;

    public Article(String title, String description, List<Product> productId, List<SubCategory> subCategoryId, List<Category> categoryId) {
        this.title = title;
        this.description = description;
        this.productId = productId;
        this.subCategoryId = subCategoryId;
        this.categoryId = categoryId;
    }

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProductId() {
        return productId;
    }

    public void setProductId(List<Product> productId) {
        this.productId = productId;
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
