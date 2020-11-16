package com.example.demo.Controller;


import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    // Find all users
    @GetMapping("/")
    public List<Users> findAll() {
        return userService.findAll();
    }

    // Find by id
    @GetMapping("/{id}")
    public Users findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    // Change by id
    @PutMapping("/{id}")
    public Users changeById(@PathVariable("id") Integer id, @RequestBody Users user) throws Exception {
        userService.changeById(id, user);
        return user;
    }

    // Delete by id
    @DeleteMapping("/id")
    public ResponseEntity<String> deleteById(@PathVariable("id") Integer id) {
        if (!userService.deleteById(id))
            return new ResponseEntity<>("User with " + id + " doesn't exist!", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>("User has been deleted!", HttpStatus.OK);
    }
}
