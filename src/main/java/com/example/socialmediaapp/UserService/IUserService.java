package com.example.socialmediaapp.UserService;

import com.example.socialmediaapp.model.Role;
import com.example.socialmediaapp.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String email, String roleName);
    User getUser(String email);
    List<User> getUsers();
}
