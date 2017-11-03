package com.pepcus.messaging.user.repository;

import com.pepcus.messaging.user.model.User;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface IUserManagementRespository {

    void delete(long id);

    List<User> findAll();

    User findOne(long id);

    void save(User saved);

    void update(User user);
}
