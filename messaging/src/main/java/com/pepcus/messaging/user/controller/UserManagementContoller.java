package com.pepcus.messaging.user.controller;

import com.pepcus.messaging.user.exceptions.UserNotFoundException;
import com.pepcus.messaging.user.model.User;
import com.pepcus.messaging.user.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messaging")
public class UserManagementContoller {

    @Autowired
    UserManagementService userManagementService;

    @RequestMapping(value = "/health",method = RequestMethod.GET)
    User health(){
         return new User();
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    ResponseEntity<User> create(@RequestBody User user) {
        System.out.println("Hi");
        User createdUser = userManagementService.createUser(user);

        return new ResponseEntity<User>(createdUser, HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") long id) {
        userManagementService.delete(id);
        return "Success";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET )
    Iterable<User> findAll() {
        return userManagementService.findAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    ResponseEntity<?> findById(@PathVariable("id") long id) {
        User user= userManagementService.findById(id);
        return  new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT )
    String update(@RequestBody @Valid User user,@PathVariable("id") long id) {
        User existingUser= userManagementService.findById(id);
        existingUser.setFirebaseAppId(user.getFirebaseAppId());
        existingUser.setMobileNo(user.getMobileNo());

         userManagementService.update(existingUser);
         return "Success";
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleTodoNotFound(UserNotFoundException ex) {
    }

}
