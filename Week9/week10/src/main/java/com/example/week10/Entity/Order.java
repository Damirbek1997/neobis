package com.example.week10.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_email", length = 100)
    private String userEmail;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "order_date")
    private Date orderDate;

    @ManyToMany
    private Set<Product> product;

    public Order(String userEmail, BigDecimal total, Date orderDate, Set<Product> product) {
        this.userEmail = userEmail;
        this.total = total;
        this.orderDate = orderDate;
        this.product = product;
    }

    public Order(String userEmail) {
        this.userEmail = userEmail;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
