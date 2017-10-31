package com.pepcus.messaging.user.model;


import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String firebaseAppId;
    private String mobileNo;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
