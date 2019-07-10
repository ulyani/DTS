package com.example.pertemuan7b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Input;
    TextView Tampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tampil = findViewById(R.id.Tampil1);
        Input = findViewById(R.id.input1);

    }

    public void Muncul (View v) {
        Tampil.setText("Nama Anda adalah :"+Input.getText() );

    }
}
