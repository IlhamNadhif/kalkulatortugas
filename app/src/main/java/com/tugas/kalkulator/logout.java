package com.tugas.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class logout extends AppCompatActivity {
    SharedPreferences pref;
    Button logout,kalkulator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        logout=findViewById(R.id.logout);
        kalkulator = findViewById(R.id.kalkulator);
        pref=getSharedPreferences("login",MODE_PRIVATE);

        kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kal = new Intent(logout.this,MainActivity.class);
                startActivity(kal);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pref.edit().clear().apply();
                Toast.makeText(logout.this, "Logout berhasil", Toast.LENGTH_SHORT).show();
                Intent back = new Intent(logout.this,login.class);
                startActivity(back);
            }
        });
    }
}
