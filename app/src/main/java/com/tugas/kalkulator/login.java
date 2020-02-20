package com.tugas.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button buttonlogin;
    EditText username;
    EditText password;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = getSharedPreferences("login", MODE_PRIVATE);

        buttonlogin= findViewById(R.id.btnlogin);
        username = findViewById(R.id.txtuser);
        password = findViewById(R.id.txtpass);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String use=username.getText().toString().trim();
                String pass=password.getText().toString().trim();

                if (use.isEmpty() || pass.isEmpty()){
                    if (use.isEmpty()){
                        username.setError("harus diisi !");
                    }
                    if (pass.isEmpty()){
                        password.setError("harus diisi");
                    }
                }else {
                    editor = pref.edit();
                    editor.putString("userid", use);
                    editor.apply();
                    Intent move = new Intent(login.this, logout.class);
                    startActivity(move);
                    finish();

                }
            }
        });




    }
}
