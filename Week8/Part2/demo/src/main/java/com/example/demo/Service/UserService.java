package com.example.demo.Service;

import com.example.demo.Entity.Role;
import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(username);

        if (user == null)
            throw new UsernameNotFoundException("User not found");

        return user;
    }

    // Method to save
    public boolean save(Users user) {
        Users userFromDb = userRepository.findByUsername(user.getUsername());

        if (userFromDb != null)
            return false;

        user.setRoles(Collections.singleton(new Role(1, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        return true;
    }

    // Method to delete
    public boolean deleteById(Integer id) {
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return true;
        }

        return false;
    }

    // Method to find all items from table
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    // Method to find by id
    public Users findById(Integer id) {
        Optional<Users> userFromDb = userRepository.findById(id);
        return userFromDb.orElse(new Users());
    }

    // Method to change item by id
    public Users changeById (Integer id, Users newUser) throws Exception {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setPassword(newUser.getPassword());

                    return userRepository.save(user);
                }).orElseThrow(Exception::new);
    }

    // Method to change password
    public String changePassword(Users user, String newPassword, String newPassword1, String oldPassword) {
        if (oldPassword.equals(user.getPassword())) {
            if (oldPassword.equals(newPassword)) {
                return "New password cannot be the same as the old";
            } else if (!newPassword.equals(newPassword1)) {
                return "Passwords mismatches";
            } else if (newPassword.length() < 8) {
                return "New password too short";
            } else if (!newPassword.matches(".*")) {
                return "New password must contain at least 1 number";
            } else {
                user.setPassword(newPassword);
                userRepository.save(user);
                return "Password has been successfully changed";
            }
        } else {
            return "Password is wrong";
        }
    }
}
