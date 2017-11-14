package com.pepcus.messaging.user.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USERS")
public class User implements Serializable{
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String firebaseAppId;

    private String mobileNo;
    private String username;
    private String password;

    public User(String firebaseAppId, String mobileNo, String username, String password) {
        this.firebaseAppId = firebaseAppId;
        this.mobileNo = mobileNo;
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firebaseAppId='" + firebaseAppId + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
