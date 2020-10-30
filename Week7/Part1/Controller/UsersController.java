package com.example.demo.Controller;

import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;
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
    private List<Users> index(){
        return userService.findAll();
    }

    // API to find item by id
    @GetMapping("/{id}")
    private Optional<Users> search(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    // API to change item by id
    @PutMapping("/{id}")
    private Users changeById(@PathVariable("id") Integer id, @RequestBody Users users) throws Exception {
        userService.changeById(id, users);
        return users;
    }

    // API to create item
    @PostMapping
    private void insert(@RequestBody Users users) {
        userService.save(users);
    }

    // API to delete item by id
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
