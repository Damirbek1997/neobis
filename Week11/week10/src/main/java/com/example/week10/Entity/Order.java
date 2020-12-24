package com.example.week10.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "total")
    private BigDecimal total;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy, timezone = UTC")
    @Column(name = "order_date")
    private Date orderDate;

    @ManyToMany
    private Set<Product> product;

    public Order(String username, BigDecimal total, Date orderDate, Set<Product> product) {
        this.username = username;
        this.total = total;
        this.orderDate = orderDate;
        this.product = product;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
