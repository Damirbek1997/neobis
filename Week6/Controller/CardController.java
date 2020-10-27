package com.example.demo.Controller;

import com.example.demo.Entity.Card;
import com.example.demo.Entity.Users;
import com.example.demo.Service.CardService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService cardService;

    // API to find all items
    @GetMapping("/")
    private List<Card> index(){
        return cardService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Card> search(@PathVariable("id") Integer id) {
        return cardService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private Card changeById(@PathVariable("id") Integer id, @RequestBody Card card) throws Exception {
        cardService.changeById(id, card);
        return card;
    }

    // API to create item
    @PostMapping
    private void insert(@RequestBody Card card) {
        cardService.save(card);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        cardService.deleteById(id);
    }
}
