package com.example.demo.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

    @OneToMany
    @JoinColumn(name = "order_product_id", referencedColumnName = "id")
    private List<Product> orderProductId;

    @OneToMany
    @JoinColumn(name = "card_id", referencedColumnName = "id")
    private List<Card> cardId;

    public Order(String userEmail, BigDecimal total, Date orderDate, List<Product> orderProductId, List<Card> cardId) {
        this.userEmail = userEmail;
        this.total = total;
        this.orderDate = orderDate;
        this.orderProductId = orderProductId;
        this.cardId = cardId;
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

    public List<Product> getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(List<Product> orderProductId) {
        this.orderProductId = orderProductId;
    }

    public List<Card> getCardId() {
        return cardId;
    }

    public void setCardId(List<Card> cardId) {
        this.cardId = cardId;
    }
}
