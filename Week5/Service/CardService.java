package com.example.demo.Service;

import com.example.demo.Entity.Card;
import com.example.demo.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    // Method to save
    public void save(Card card) {
        cardRepository.save(card);
    }

    // Method to delete
    public void deleteById(Integer id) {
        cardRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    // Method to find by id
    public Optional<Card> findById(Integer id) {
        return cardRepository.findById(id);
    }

    // Method to change item by id
    public Card changeById (Integer id, Card card) throws Exception {
        return cardRepository.findById(id)
                .map(card1 -> {
                    card.setId(card.getId());
                    card.setCardNumber(card.getCardNumber());
                    card.setUserId(card.getUserId());

                    return cardRepository.save(card);
                }).orElseThrow(Exception::new);
    }
}
