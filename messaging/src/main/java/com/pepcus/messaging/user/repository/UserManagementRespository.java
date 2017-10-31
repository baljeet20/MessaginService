package com.pepcus.messaging.user.repository;

import com.pepcus.messaging.user.model.User;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UserManagementRespository extends Repository<User, String> {

    void delete(User deleted);

    List<User> findAll();

    User findOne(String id);

    User save(User saved);
}
