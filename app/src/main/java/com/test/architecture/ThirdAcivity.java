package com.test.architecture;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;


public class ThirdAcivity extends AppCompatActivity {

    private static final int REQUEST_PHONE_CALL = 22222;

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

    private ArrayList<Button> buttons;

    EditText phoneTextField;

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

        btnClean = findViewById(R.id.btnClean);
        btnCall = findViewById(R.id.btnCall);

        phoneTextField = findViewById(R.id.PhoneTextField);

        buttons= new ArrayList<>(Arrays.asList(btnNumber0 , btnNumber1, btnNumber2, btnNumber3, btnNumber4, btnNumber5, btnNumber6, btnNumber7, btnNumber8, btnNumber9, btnSumbol1 , btnSumbol2));
        setClickListeners();

        btnCall.setOnClickListener(v -> call(phoneTextField.getText().toString()));

        btnClean.setOnClickListener(v->{
            if (phoneTextField.getText().length()==0) return;
            phoneTextField.setText(phoneTextField.getText().toString().substring(0,phoneTextField.getText().length()-1));
        });


        /*
        btnNumber0.setOnClickListener (view -> {
            phoneTextField.setText("0");
        });
        btnNumber1.setOnClickListener (view -> {
            phoneTextField.setText("1");         /* ? PhoneTextField
        });
        btnNumber2.setOnClickListener (view -> {
            phoneTextField.setText("2");
        });
        btnNumber3.setOnClickListener (view -> {
            phoneTextField.setText("3");
        });
        btnNumber4.setOnClickListener (view -> {
            phoneTextField.setText("4");
        });
        btnNumber5.setOnClickListener (view -> {
            phoneTextField.setText("5");
        });
        btnNumber6.setOnClickListener (view -> {
            phoneTextField.setText("6");
        });
        btnNumber7.setOnClickListener (view -> {
            phoneTextField.setText("7");
        });
        btnNumber8.setOnClickListener (view -> {
            phoneTextField.setText("8");
        });
        btnNumber9.setOnClickListener (view -> {
            phoneTextField.setText("9");
        });
        btnSumbol1.setOnClickListener (view -> {
            phoneTextField.setText("#");
        });

        btnSumbol2.setOnClickListener (view -> {
            phoneTextField.setText("*");
        });


        btnClean.setOnClickListener(v -> call(etPhone.getText().toString()));

        btnCall.setOnClickListener(view -> {

        });*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data ){
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==REQUEST_PHONE_CALL){
            call(phoneTextField.getText().toString());
        }
    }

    private void setClickListeners() {
        for(Button button : buttons){
            button.setOnClickListener(v->phoneTextField.setText(phoneTextField.getText().append(button.getText().toString())));
        }
    }


    private void call(String phone){
        Intent intent= new Intent(Intent.ACTION_CALL);
        Uri.parse("tel:" + phone);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
        }
        else
        {
            startActivity(intent);
        }
    }
}