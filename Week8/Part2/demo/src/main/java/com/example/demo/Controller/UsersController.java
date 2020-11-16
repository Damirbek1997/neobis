package com.example.demo.Controller;

import com.example.demo.Config.UserCredentialsPojo;
import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class UsersController {
    @Autowired
    private UserService userService;

    // API to find all info about current user
    @GetMapping("/")
    private UserDetails index(@AuthenticationPrincipal UserDetails user){
        return user;
    }

    // API to change item by id
    @PutMapping("/settings")
    private String updatePassword(@AuthenticationPrincipal Users user,
                                 @RequestBody UserCredentialsPojo pojo) throws Exception {
        return userService.changePassword(user, pojo.getNewPassword(),
                                            pojo.getRepeatPassword(),
                                            pojo.getOldPassword());
    }
}
