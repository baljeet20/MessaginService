package com.pepcus.messaging.user.service;

import com.pepcus.messaging.user.model.User;
import com.pepcus.messaging.user.repository.UserManagementRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserManagementService {

    @Autowired
    UserManagementRespository userManagementRespository;

    public User createUser(User user) {
        return userManagementRespository.save(user);
    }

    public User delete(String id) {
        return userManagementRespository.findOne(id);
    }

    public List<User> findAll() {
        return userManagementRespository.findAll();
    }

    public User findById(String id) {
        return userManagementRespository.findOne(id);
    }

    public User update(User user) {
        return userManagementRespository.save(user);
    }
}
