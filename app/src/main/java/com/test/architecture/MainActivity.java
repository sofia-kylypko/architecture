package com.test.architecture;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    private String str;
    private String str1;


    Button btnLogin;
    EditText etLogin;
    EditText etPassword;
    private ArrayList<UserModel> users;
    private HashMap<String, UserModel> userTypes = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);
        userTypes = new HashMap<>();
        users = new Utils().getUsers();
        userTypes.put("ENGENEER", users.get(2));

        btnLogin.setOnClickListener(view -> {

            if (checkLogin(etLogin.getText().toString(), etPassword.getText().toString()) /*&& checkPassword(etPassword.getText().toString())*/) {
                startActivity();
            } else if (etPassword.getText().toString().length() < 8) {
                Toast.makeText(this, " Пароль не должен быть короче 8 символов", Toast.LENGTH_SHORT).show();
            } else if (!(str == str1)) {
                Toast.makeText(this, "Пароль должен иметь заглавную букву", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Пароль или логин неверный", Toast.LENGTH_SHORT).show();
            }
        });




        /* моя версия
        btnLogin.setOnClickListener(view -> {
            if (checkLogin(etLogin.getText().toString()) && checkPasswordIncludeNumbers(etPassword.getText().toString()) && checkPasswordCapitalsLetters(etPassword.getText().toString()) && checkPasswordLength(etPassword.getText().toString())) {
                if (isPasswordValid(etPassword.getText().toString())) {
                    startActivity();
                }else{
                    Toast.makeText(this, "Login or password is incorect", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
    private boolean checkLogin(String login) {
        for (int i = 0; i < new Utils().getUsers().size(); i++) {
            if (new Utils().getUsers().get(i).equals(login)) return true;
        }
        return false;
    }


    private void startActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }
    private boolean checkLogin(String login, String password) {
        for (UserModel userModel : users) {
            if (userModel.getLogin().equals(login) && userModel.getPassword().equals(password))
                return true;
        }
        return false;
    }


    /*private boolean checkPasswordIncludeNumbers(String password) {
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isDigit(x)) {
                return true;
            }
        }

        Toast.makeText(this, "Password need to include numbers ", Toast.LENGTH_SHORT).show();
        return false;

    }


    private boolean checkPasswordCapitalsLetters(String password) {
        boolean resultA = false;
        boolean resultB = false;
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isUpperCase(x)) {
                resultA = true;
            } else {
                resultB = true;
            }
        }
        if (resultA && resultB) {
            return true;
        } else {
            Toast.makeText(this, "Password need to include upper and lower letters ", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean checkPasswordLength(String password) {
        if (password.length() > 7) {
            return true;
        } else {
            Toast.makeText(this, "Password need to include eight or more symbols", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean isPasswordValid (String password) {
       tmpPassword= new Utils().getUsers();
        if (tmpPassword.equals(password)){
            return true;
        }else {
            return false;
        }
    }*/

}