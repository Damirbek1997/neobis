package com.example.demo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "is_available")
    private boolean isAvailable;

    @OneToMany
    @JoinColumn(name = "sub_category_id")
    private List<SubCategory> subCategoryId;

    public Category(String name, boolean isAvailable, List<SubCategory> subCategoryId) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.subCategoryId = subCategoryId;
    }

    public Category() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public List<SubCategory> getSubCategory() {
        return subCategoryId;
    }

    public void setSubCategory(List<SubCategory> subCategoryId) {
        this.subCategoryId = subCategoryId;
    }
}
