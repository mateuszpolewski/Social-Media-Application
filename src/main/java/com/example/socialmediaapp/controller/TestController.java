package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.UserService.RoleService;
import com.example.socialmediaapp.UserService.UserService;
import com.example.socialmediaapp.model.Role;
import com.example.socialmediaapp.model.User;
import com.example.socialmediaapp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @GetMapping("/add-roles")
    public void saveRoles() {
        userService.saveRole(new Role(1L, "USER"));
        userService.saveRole(new Role(2L, "ADMIN"));
    }
    @GetMapping("/add-users")
    public void createUser() {
        User user = new User(1L,"Jan", "Kowalski","jkowalski@gmail.com" ,
                new BCryptPasswordEncoder().encode("password"),
                Arrays.asList(roleService.getRole("USER")));
        userService.saveUser(user);
    }
}
