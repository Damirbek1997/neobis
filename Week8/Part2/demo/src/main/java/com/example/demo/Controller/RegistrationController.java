package com.example.demo.Controller;

import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class RegistrationController {
    @Autowired
    private UserService userService;

    // Registration
    @PostMapping
    public ResponseEntity<String> auth(@RequestBody Users user) {
        if (!user.getPassword().equals(user.getPasswordConfirm()))
            return new ResponseEntity<>("Password doesn't match!", HttpStatus.BAD_REQUEST);
        else if (!userService.save(user))
            return new ResponseEntity<>("This username is busy!", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>("User has been created", HttpStatus.OK);
    }
}
