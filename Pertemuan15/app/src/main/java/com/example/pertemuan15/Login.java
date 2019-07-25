package com.example.pertemuan15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username,password;

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
    }
    public void Login (View v) {
       String username1 = username.getText().toString();
       String password1 = password.getText().toString();



        if (username1.equals("admin") && password1.equals("admin")) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            Login.this.finish();
        } else {
            Toast.makeText(getApplicationContext(), "Login Gagal",Toast.LENGTH_SHORT).show();
        }
    }
}
