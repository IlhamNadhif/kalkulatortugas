package com.tugas.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ControlClass extends AppCompatActivity {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref =getSharedPreferences("login", Context.MODE_PRIVATE);

        if(pref.getString("userid","").isEmpty()){
            Intent move = new Intent(getApplicationContext(),login.class);
            startActivity(move);
            finish();
        }else {
            Intent move = new Intent(getApplicationContext(),logout.class);
            startActivity(move);
            finish();
        }

    }
}
