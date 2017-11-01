package com.pepcus.messaging.posts.controller;

import com.pepcus.messaging.posts.model.Posts;
import com.pepcus.messaging.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messaging")
public class PostsController {

    @Autowired
    PostsService postsService;

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    Posts findById(@PathVariable("id") String id) {
        return postsService.findById(id);
    }

    @RequestMapping(value = "/posts",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Posts create(@RequestBody @Valid Posts posts) {
        return postsService.createPost(posts);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    Posts delete(@PathVariable("id") String id) {
        return postsService.delete(id);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    Posts update(@PathVariable("id") String id) {
        return postsService.update(id);
    }

    @RequestMapping(value = "/posts/user/{id}", method = RequestMethod.GET)
    List<Posts> getAllUserPosts(@PathVariable("id") String id) {
        return postsService.getAllUserPosts(id);
    }



}
