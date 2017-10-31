package com.pepcus.messaging.user.controller;

import com.pepcus.messaging.user.exceptions.UserNotFoundException;
import com.pepcus.messaging.user.model.User;
import com.pepcus.messaging.user.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messaging")
public class UserManagementContoller {

    @Autowired
    UserManagementService userManagementService;

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    User create(@RequestBody @Valid User user) {
        return userManagementService.createUser(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    User delete(@PathVariable("id") String id) {
        return userManagementService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<User> findAll() {
        return userManagementService.findAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") String id) {
        return userManagementService.findById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    User update(@RequestBody @Valid User user) {
        return userManagementService.update(user);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleTodoNotFound(UserNotFoundException ex) {
    }

}
