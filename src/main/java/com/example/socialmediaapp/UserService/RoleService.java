package com.example.socialmediaapp.UserService;

import com.example.socialmediaapp.model.Role;
import com.example.socialmediaapp.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService{

    RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public Role getRole(String name) {
        return roleRepository.findByName(name);
    }
}
