package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu1 extends AppCompatActivity {
    EditText input;
    TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        input = findViewById(R.id.Input1);
        tampil = findViewById(R.id.Tampil);

    }

    public void tampilkan (View v){
        int angka,hasil;
        angka = Integer.parseInt(input.getText().toString()) ;
        hasil = angka%2;
        if(hasil == 0 ){

            tampil.setText("Genap");
        }
        else {
            tampil.setText("Ganjil");

        }

    }
}
