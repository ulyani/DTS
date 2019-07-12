package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Inputa,Inputb,Inputc;
    TextView Tampila,Tampilb,Tampilc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inputa = findViewById(R.id.Input1);
        Inputb = findViewById(R.id.Input2);
        Inputc = findViewById(R.id.Input3);
        Tampila = findViewById(R.id.Tampil1);
        Tampilb = findViewById(R.id.Tampil2);
        Tampilc = findViewById(R.id.Tampil3);

    }
    public void Munculkan (View v)
    {

        Tampila.setText("NIM :"+Inputa.getText());
        Tampilb.setText("Nama :"+Inputb.getText());
        Tampilc.setText("Kampus :"+Inputc.getText());



    }
}
