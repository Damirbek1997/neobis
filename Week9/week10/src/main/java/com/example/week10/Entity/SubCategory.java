package com.example.week10.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sub_categories")
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "is_available")
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name="category_id", referencedColumnName = "id")
    private Category categories;

    public SubCategory(String name, boolean isAvailable, Category categories) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.categories = categories;
    }

    public SubCategory(String name) {
        this.name = name;
    }

    public SubCategory() {
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Category getCategories() {
        return categories;
    }

    public void setCategories(Category categories) {
        this.categories = categories;
    }
}
