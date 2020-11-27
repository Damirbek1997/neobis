package com.example.week10.Controller;

import com.example.week10.Entity.User;
import com.example.week10.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    // Find all users
    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    // Find by id
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    // Change by id
    @PutMapping("/{id}")
    public User changeById(@PathVariable("id") Integer id, @RequestBody User user) throws Exception {
        userService.changeById(id, user);
        return user;
    }

    // Create a user
    @PostMapping("/")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>("User has been created!", HttpStatus.OK);
    }

    // Delete by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
        return new ResponseEntity<>("User has been deleted!", HttpStatus.OK);
    }
}
