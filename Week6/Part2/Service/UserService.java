package com.example.demo.Service;

import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Method to save
    public void save(Users users) {
        userRepository.save(users);
    }

    // Method to delete
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    // Method to find all items from table
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    // Method to find by id
    public Optional<Users> findById(Integer id) {
        return userRepository.findById(id);
    }

    // Method to change item by id
    public Users changeById (Integer id, Users newUser) throws Exception {
        return userRepository.findById(id)
                .map(users -> {
                    users.setName(newUser.getName());
                    users.setPassword(newUser.getPassword());
                    users.setEmail(newUser.getEmail());

                    return userRepository.save(users);
                }).orElseThrow(Exception::new);
    }
}
