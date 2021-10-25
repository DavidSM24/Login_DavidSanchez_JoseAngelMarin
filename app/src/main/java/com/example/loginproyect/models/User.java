package com.example.loginproyect.models;

public class User {
    private int id;
    private String username;
    private String password;

    public User(){
        this(-1,"",""
    }

    public User(int id,String username, String password) {
        this.id=id;
        this.username = username;
        this.password = password;
    }
}
