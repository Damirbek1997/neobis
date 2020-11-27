package com.example.week10.Controller;

import com.example.week10.Entity.User;
import com.example.week10.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;

    // API to find all items
    @GetMapping("/")
    private List<User> findAll(){
        return userService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<User> findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private User changeById(@PathVariable("id") Integer id, @RequestBody User user) throws Exception {
        userService.changeById(id, user);
        return user;
    }

    // API to create item
    @PostMapping
    private void createUser(@RequestBody User user) {
        userService.save(user);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
