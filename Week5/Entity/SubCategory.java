package com.example.demo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sub_categories")
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "is_available")
    private boolean isAvailable;

    @OneToMany
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private List<Category> categoryId;

    public SubCategory(String name, boolean isAvailable, List<Category> categoryId) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.categoryId = categoryId;
    }

    public SubCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Category> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Category> categoryId) {
        this.categoryId = categoryId;
    }
}
