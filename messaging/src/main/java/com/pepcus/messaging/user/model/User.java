package com.pepcus.messaging.user.model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private long id;

    @Column(name="firebaseAppId")
    private String firebaseAppId;

    @Column(name="mobileNo")
    private String mobileNo;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirebaseAppId() {

        return firebaseAppId;
    }

    public void setFirebaseAppId(String firebaseAppId) {
        this.firebaseAppId = firebaseAppId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
