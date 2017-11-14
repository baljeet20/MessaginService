package com.pepcus.messaging.user.service;

import com.pepcus.messaging.user.model.User;
import com.pepcus.messaging.user.repository.IUserManagementRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementService {

    @Autowired
    IUserManagementRespository IUserManagementRespository;

    public User createUser(User user) {
        User user1= IUserManagementRespository.save(user);
        return IUserManagementRespository.findById(user1.getId());
    }

    public User delete(long id) {
        return IUserManagementRespository.findById(id);
    }

    public Iterable<User> findAll() {
        return IUserManagementRespository.findAll();
    }

    public User findById(long id) {
        return IUserManagementRespository.findById(id);
    }

    public void update(User user) {
         IUserManagementRespository.save(user);
    }
}
