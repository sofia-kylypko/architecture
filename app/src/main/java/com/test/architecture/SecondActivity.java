package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnStart2=findViewById(R.id.btnStart2);

        btnStart2.setOnClickListener(view->{
            Intent intent= new Intent(this,SecondActivity.class);
            startActivity(intent);
        });
    }
}