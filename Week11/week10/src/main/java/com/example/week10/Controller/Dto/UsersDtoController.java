package com.example.week10.Controller.Dto;

import com.example.week10.Dto.Transfer.User.AdminDetails;
import com.example.week10.Dto.Transfer.User.Details;
import com.example.week10.Dto.Transfer.User.NewUser;
import com.example.week10.Dto.Transfer.User.UpdateDetails;
import com.example.week10.Dto.UserDto;
import com.example.week10.Entity.User;
import com.example.week10.Service.Dto.UserServiceDto;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dto")
public class UsersDtoController {
    @Autowired
    private UserServiceDto userService;

    // API to find all items
    @JsonView(AdminDetails.class)
    @GetMapping("/")
    private Iterable<UserDto> index(){
        return userService.findAll();
    }

    // API to find item by id
    @JsonView(AdminDetails.class)
    @GetMapping("/{id}")
    private Optional<UserDto> search(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    // API to change item by id
    @JsonView(Details.class)
    @PutMapping("/{id}")
    private ResponseEntity<UserDto> changeById(@AuthenticationPrincipal User user, @Validated(NewUser.class) @RequestBody UserDto userDto) throws Exception {
        return new ResponseEntity<>(userService.changeById(user.getId(), userDto), HttpStatus.OK);
    }

    // API to create item
    @JsonView(Details.class)
    @PostMapping
    private ResponseEntity<UserDto> insert(@Validated(UpdateDetails.class) @RequestBody UserDto userDto) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // API to delete item by id
    @JsonView(Details.class)
    @DeleteMapping("/{id}")
    private void delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
