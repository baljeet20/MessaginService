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

    public void createUser(User user) {
         IUserManagementRespository.save(user);
    }

    public User delete(long id) {
        return IUserManagementRespository.findOne(id);
    }

    public List<User> findAll() {
        return IUserManagementRespository.findAll();
    }

    public User findById(long id) {
        return IUserManagementRespository.findOne(id);
    }

    public void update(User user) {
         IUserManagementRespository.update(user);
    }
}
