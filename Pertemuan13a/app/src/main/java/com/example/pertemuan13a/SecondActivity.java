package com.example.pertemuan13a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText input1,input2;
    TextView hasil,hasil1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        hasil = findViewById(R.id.hasil);
        hasil1 = findViewById(R.id.hasil1);
    }

    public void Tampilkan (View v){

        hasil1.setText("NIM Anda :"+input1.getText().toString());
        hasil.setText("Nama Anda :"+input2.getText().toString());

    }


}
