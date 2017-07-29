package com.company;

import java.util.Arrays;

/**
 * Created by randkill on 6/26/17.
 */
public class Account {
    String Username;
    String Password;
    String PasswordHint;

    public Account(String username, String password, String passwordHint) {
        Username = username;
        Password = password;
        PasswordHint = passwordHint;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPasswordHint() {
        return PasswordHint;
    }

    public void setPasswordHint(String passwordHint) {
        PasswordHint = passwordHint;
    }

    @Override
    public String toString() {
        return Username +"\n" + Password + "\n" + PasswordHint;
    }
}
