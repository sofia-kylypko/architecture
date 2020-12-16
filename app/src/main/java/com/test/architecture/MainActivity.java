package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.test.architecture.Utils.password;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etLogin;
    EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(view -> {
            if (checkLogin(etLogin.getText().toString()) && checkPasswordIncludeNumbers(etPassword.getText().toString()) && checkPasswordCapitalsLetters(etPassword.getText().toString()) && checkPasswordLength(etPassword.getText().toString())) {
                if (isPasswordValid(etPassword.getText().toString())) {
                    startActivity();
                }else{
                    Toast.makeText(this, "Login or password is incorect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean checkLogin(String login) {
        for (int i = 0; i < Utils.logins.length; i++) {
            if (Utils.logins[i].equals(login)) return true;
        }
        return false;
    }


    private void startActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }


    private boolean checkPasswordIncludeNumbers(String password) {
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

    private boolean isPasswordValid(String password) {
        String tmpPassword=Utils.password;
        if (tmpPassword.equals(password)){
            return true;
        }else {
            return false;
        }
    }
}