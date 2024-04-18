package com.example.tugaslogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class datalogin extends AppCompatActivity {

    private TextView loginUsernameTextView;
    private TextView loginPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datalogin);

        loginUsernameTextView = findViewById(R.id.loginuser);
        loginPasswordTextView = findViewById(R.id.loginpass);

        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("USERNAME");
            String password = intent.getStringExtra("PASSWORD");

            if (username != null) {
                loginUsernameTextView.setText(username);
            }

            if (password != null) {
                loginPasswordTextView.setText(password);
            }
        }
    }
}
