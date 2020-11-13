package com.test;

import java.util.Objects;

public class User {
    private String username;
    private String login;
    private String email;
    private String password;
    private String role;

    public User(String tmp) throws Exception {
        String[] words = tmp.split(";");
        if (words.length < 5) {
            throw new Exception();
        }
        username = words[0];
        login = words[1];
        email = words[2];
        password = words[3];
        role = words[4];
    }

    public User() {}

    @Override
    public String toString() {
        return username + ";" +
                login + ";" +
                email + ";" +
                password + ";" + role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) &&
                login.equals(user.login) &&
                email.equals(user.email) &&
                password.equals(user.password) &&
                role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, login, email, password, role);
    }

    public void setUserName() {
        this.username = username;
    }

    public void setLogin() {
        this.login = login;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setPassword() {
        this.password = password;
    }

    public void setRole() {
        this.role = role;
    }
}
