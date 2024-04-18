package com.example.tugaslogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText loginuser;
    private EditText loginpass;
    private Button btnloginup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginuser = findViewById(R.id.loginuser);
        loginpass = findViewById(R.id.loginpass);
        btnloginup = findViewById(R.id.btnloginup);

        Button btnlogin = findViewById(R.id.btnloginbottom);
        Button btnregis = findViewById(R.id.btnregisbottom);

        btnlogin.setOnClickListener(this);
        btnregis.setOnClickListener(this);
        btnloginup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        if (v.getId() == R.id.btnloginbottom) {
            intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnregisbottom) {
            intent = new Intent(MainActivity.this, register.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnloginup) {
            String username = loginuser.getText().toString();
            String password = loginpass.getText().toString();

            intent = new Intent(MainActivity.this, datalogin.class);
            intent.putExtra("USERNAME", username);
            intent.putExtra("PASSWORD", password);
            startActivity(intent);
        }
    }
}
