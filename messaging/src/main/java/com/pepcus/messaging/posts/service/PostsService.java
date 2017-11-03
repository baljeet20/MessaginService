package com.pepcus.messaging.posts.service;

import com.pepcus.messaging.posts.model.Posts;
import com.pepcus.messaging.posts.repository.IPostsRepository;
import com.pepcus.messaging.posts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    IPostsRepository postsRepository;

    public Posts findById(String id) {
        return postsRepository.findOne(id);
    }

    public Posts createPost(Posts posts) {
        return postsRepository.save(posts);
    }

    public Posts delete(String id) {
        return postsRepository.delete(id);
    }

    public Posts update(String id) {
        return postsRepository.update(id);
    }

    public List<Posts> getAllUserPosts(String id) {
        return postsRepository.getAllUserPosts(id);
    }
}
