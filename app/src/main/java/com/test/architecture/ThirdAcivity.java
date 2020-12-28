package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class ThirdAcivity extends AppCompatActivity {
    ArrayList<String> phone = new ArrayList<>();

    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;
    Button btnNumber0;

    Button btnSumbol1;
    Button btnSumbol2;

    Button btnClean;

    Button btnCall;

    EditText PhoneTextField;

    /*int N2;
    int N3;
    int N4;
    int N5;
    int N6;
    int N7;
    int N8;
    int N9;
    int N0;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_acivity);

        btnNumber1 = findViewById(R.id.btnNumber1);
        btnNumber2 = findViewById(R.id.btnNumber2);
        btnNumber3 = findViewById(R.id.btnNumber3);
        btnNumber4 = findViewById(R.id.btnNumber4);
        btnNumber5 = findViewById(R.id.btnNumber5);
        btnNumber6 = findViewById(R.id.btnNumber6);
        btnNumber7 = findViewById(R.id.btnNumber7);
        btnNumber8 = findViewById(R.id.btnNumber8);
        btnNumber9 = findViewById(R.id.btnNumber9);
        btnNumber0 = findViewById(R.id.btnNumber0);

        btnSumbol1 = findViewById(R.id.btnSumbol1);
        btnSumbol2 = findViewById(R.id.btnSumbol2);

        PhoneTextField = findViewById(R.id.PhoneTextField);



        btnNumber0.setOnClickListener (view -> {
            PhoneTextField.setText("0");
        });
        btnNumber1.setOnClickListener (view -> {
            PhoneTextField.setText("1");
        });
        btnNumber2.setOnClickListener (view -> {
            PhoneTextField.setText("2");
        });
        btnNumber3.setOnClickListener (view -> {
            PhoneTextField.setText("3");
        });
        btnNumber4.setOnClickListener (view -> {
            PhoneTextField.setText("4");
        });
        btnNumber5.setOnClickListener (view -> {
            PhoneTextField.setText("5");
        });
        btnNumber6.setOnClickListener (view -> {
            PhoneTextField.setText("6");
        });
        btnNumber7.setOnClickListener (view -> {
            PhoneTextField.setText("7");
        });
        btnNumber8.setOnClickListener (view -> {
            PhoneTextField.setText("8");
        });
        btnNumber9.setOnClickListener (view -> {
            PhoneTextField.setText("9");
        });
        btnSumbol1.setOnClickListener (view -> {
            PhoneTextField.setText("#");
        });
        btnSumbol2.setOnClickListener (view -> {
            PhoneTextField.setText("*");
        });

        btnClean.setOnClickListener(view -> {
            phone.remove(phone.size());
            PhoneTextField.setText((CharSequence) phone);
        });

        btnCall.setOnClickListener(view -> {

        });

    }


}