package com.example.demo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "card_number", length = 100)
    private String cardNumber;

    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<Users> userId;

    public Card(String cardNumber, List<Users> userId) {
        this.cardNumber = cardNumber;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public List<Users> getUserId() {
        return userId;
    }

    public void setUserId(List<Users> userId) {
        this.userId = userId;
    }
}
