package com.defaultBasic.auth.entity;

public class User {
    private String name;
    private int id;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, int id, String password) {
        super();
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public User() {
        super();

    }
}
