package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    private List<Users> index(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Users> search(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @PostMapping("/insert")
    private void insert(@RequestBody Users users) {
        userService.save(users);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
