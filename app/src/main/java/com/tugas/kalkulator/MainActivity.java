package com.tugas.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka1;
    EditText angka2;
    Button tambah;
    Button kurang;
    Button kali;
    Button bagi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.angka_pertama);
        angka2 = findViewById(R.id.angka_kedua);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        hasil = findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    //untuk kemungkinan error
                    double pertama = Double.parseDouble(angka1.getText().toString());
                    double kedua = Double.parseDouble(angka2.getText().toString());
                    Toast.makeText(MainActivity.this, "bisa !!!!!!!", Toast.LENGTH_SHORT).show();
                    double rumus = pertama + kedua;
                    hasil.setText(Double.toString(rumus));

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
                }

            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //untuk kemungkinan error
                    double pertama = Double.parseDouble(angka1.getText().toString());
                    double kedua = Double.parseDouble(angka2.getText().toString());
                    Toast.makeText(MainActivity.this, "bisa !!!!!!!", Toast.LENGTH_SHORT).show();
                    double rumus = pertama - kedua;
                    hasil.setText(Double.toString(rumus));

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //untuk kemungkinan error
                    double pertama = Double.parseDouble(angka1.getText().toString());
                    double kedua = Double.parseDouble(angka2.getText().toString());
                    Toast.makeText(MainActivity.this, "bisa !!!!!!!", Toast.LENGTH_SHORT).show();
                    double rumus = pertama * kedua;
                    hasil.setText(Double.toString(rumus));

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //untuk kemungkinan error
                    double pertama = Double.parseDouble(angka1.getText().toString());
                    double kedua = Double.parseDouble(angka2.getText().toString());
                    Toast.makeText(MainActivity.this, "bisa !!!!!!!", Toast.LENGTH_SHORT).show();
                    double rumus = pertama / kedua;
                    hasil.setText(Double.toString(rumus));

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
