package com.example.tugaslogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity implements View.OnClickListener {

    private EditText regisuser;
    private EditText regisemail;
    private EditText regispass;
    private CheckBox cbsyarat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regisuser = findViewById(R.id.regisuser);
        regisemail = findViewById(R.id.regisemail);
        regispass = findViewById(R.id.regispass);
        cbsyarat = findViewById(R.id.cbsyarat);

        Button btnlogin = findViewById(R.id.btnloginbottom);
        Button btnregis = findViewById(R.id.btnregisbottom);
        Button btnregisatas = findViewById(R.id.btnregis);

        btnlogin.setOnClickListener(this);
        btnregis.setOnClickListener(this);
        btnregisatas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnloginbottom) {
            Intent intentLogin = new Intent(register.this, MainActivity.class);
            startActivity(intentLogin);
        } else if (v.getId() == R.id.btnregisbottom) {
            Intent intentDataRegis = new Intent(register.this, register.class);
            startActivity(intentDataRegis);
        } else if (v.getId() == R.id.btnregis) {
            if (cbsyarat.isChecked()) {
                String username = regisuser.getText().toString();
                String email = regisemail.getText().toString();
                String password = regispass.getText().toString();

                Intent intentDataRegis = new Intent(register.this, dataregis.class);
                intentDataRegis.putExtra("USERNAME", username);
                intentDataRegis.putExtra("EMAIL", email);
                intentDataRegis.putExtra("PASSWORD", password);
                startActivity(intentDataRegis);
            } else {
                Toast.makeText(this, "Anda harus menyetujui syarat dan ketentuan", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
