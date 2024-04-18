package com.example.tugaslogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class dataregis extends AppCompatActivity {

    private TextView regisUsername;
    private TextView regisEmail;
    private TextView regisPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataregis);

        regisUsername = findViewById(R.id.regisuser);
        regisEmail = findViewById(R.id.regisemail);
        regisPassword = findViewById(R.id.regispass);

        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("USERNAME");
            String email = intent.getStringExtra("EMAIL");
            String password = intent.getStringExtra("PASSWORD");

            if (username != null) {
                regisUsername.setText(username);
            }

            if (email != null){
                regisEmail.setText(email);
            }

            if (password != null) {
                regisPassword.setText(password);
            }
        }
    }
}