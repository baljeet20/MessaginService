package com.pepcus.messaging.posts.repository;

import com.pepcus.messaging.posts.model.Posts;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PostsRepository implements IPostsRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public Posts findOne(String id) {
        return null;
    }

    public Posts save(Posts posts) {
        return null;
    }

    public Posts delete(String id) {
        return null;
    }

    public Posts update(String id) {
        return null;
    }

    public List<Posts> getAllUserPosts(String id) {
        return null;
    }
}
