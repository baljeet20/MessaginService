package com.pepcus.messaging.posts.model;

import com.pepcus.messaging.user.model.User;
import org.springframework.data.annotation.Id;

import java.util.List;


public class Posts {

    @Id
    private String postsId;

    private String content;

    private User createdBy;

    private List<User> recipients;

    private int likes;

    public String getPostsId() {
        return postsId;
    }

    public void setPostsId(String postsId) {
        this.postsId = postsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<User> recipients) {
        this.recipients = recipients;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
