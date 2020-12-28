package com.test.architecture;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
    public ArrayList<UserModel> users;

    public Utils() {
        users=new ArrayList<>();
        users.add(new UserModel("password2", "login1"));
        users.add(new UserModel("password2", "login2"));
        users.add(new UserModel("password2", "login3"));
        users.add(new UserModel("password2", "login4"));
        users.add(new UserModel("password2", "login5"));
    }
    public ArrayList<UserModel> getUsers(){
        return users;
    }
    public void setUsers(ArrayList<UserModel>users){
        this.users=users;
    }
}