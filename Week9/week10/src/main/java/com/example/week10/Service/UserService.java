package com.example.week10.Service;

import com.example.week10.Entity.User;
import com.example.week10.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Method to save
    public void save(User user) {
        userRepository.save(user);
    }

    // Method to delete
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Method to find by id
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    // Method to change item by id
    public User changeById (Integer id, User newUser) throws Exception {
        return userRepository.findById(id)
                .map(users -> {
                    users.setUsername(newUser.getUsername());
                    users.setPassword(newUser.getPassword());

                    return userRepository.save(users);
                }).orElseThrow(Exception::new);
    }
}
