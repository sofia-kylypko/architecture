package com.test.architecture;

public class UserModel {


    private String password;
    private String login;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserModel(String password, String login) {
        this.password = password;
        this.login = login;
    }
}
