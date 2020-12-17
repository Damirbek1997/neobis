package com.example.week10.Service.Dto;

import com.example.week10.Dto.UserDto;
import com.example.week10.Repository.Crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceDto {
    @Autowired
    private UserCrudRepository userRepository;

    // Method to save
    public void save(UserDto user) {
        userRepository.save(user);
    }

    // Method to delete
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    // Method to find all items from table
    public Iterable<UserDto> findAll() {
        return userRepository.findAll();
    }

    // Method to find by id
    public Optional<UserDto> findById(Integer id) {
        return userRepository.findById(id);
    }

    // Method to change item by id
    public UserDto changeById (Integer id, UserDto newUser) throws Exception {
        return userRepository.findById(id)
                .map(users -> {
                    users.setUsername(newUser.getUsername());
                    users.setPassword(newUser.getPassword());

                    return userRepository.save(users);
                }).orElseThrow(Exception::new);
    }
}
