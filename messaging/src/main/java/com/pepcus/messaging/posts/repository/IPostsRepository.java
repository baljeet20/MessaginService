package com.pepcus.messaging.posts.repository;

import com.pepcus.messaging.posts.model.Posts;

import java.util.List;

public interface IPostsRepository {

    Posts findOne(String id);

    Posts save(Posts posts);

    Posts delete(String id) ;

    Posts update(String id);

    List<Posts> getAllUserPosts(String id) ;
}
