package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Inputa,Inputb;
    TextView Tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inputa = findViewById(R.id.Input1);
        Inputb = findViewById(R.id.Input2);
        Tampil = findViewById(R.id.Tampil1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item)
    {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Menu1.class));
        }
        else if (item.getItemId() == R.id.menu2)
        {
            startActivity(new Intent (this,Menu2.class));
        }
        else if (item.getItemId() == R.id.menu3){
            startActivity(new Intent (this,Menu3.class));
        }

        return true;
    }



    public void Tambah (View v) {
        if (Inputa.getText().length() > 0 && Inputb.getText().length() > 0) {
            int angka1, angka2, Tambah;
            angka1 = Integer.parseInt(Inputa.getText().toString());
            angka2 = Integer.parseInt(Inputb.getText().toString());


            Tambah = angka1 + angka2;
            Tampil.setText(Integer.toString(Tambah));
        }else{
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
            }
        }


    public void Kurang (View v)
    {
        if (Inputa.getText().length() > 0 && Inputb.getText().length() > 0) {
            int angka1, angka2, Kurang;
            angka1 = Integer.parseInt(Inputa.getText().toString());
            angka2 = Integer.parseInt(Inputb.getText().toString());


            Kurang = angka1 - angka2;
            Tampil.setText(Integer.toString(Kurang));
        }else{
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Kali (View v)
    {
        if (Inputa.getText().length() > 0 && Inputb.getText().length() > 0) {
            int angka1, angka2, Kali;
            angka1 = Integer.parseInt(Inputa.getText().toString());
            angka2 = Integer.parseInt(Inputb.getText().toString());


            Kali = angka1 * angka2;
            Tampil.setText(Integer.toString(Kali));
        }else{
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Bagi (View v)
    {
        if (Inputa.getText().length() > 0 && Inputb.getText().length() > 0) {
            int angka1, angka2, Bagi;
            angka1 = Integer.parseInt(Inputa.getText().toString());
            angka2 = Integer.parseInt(Inputb.getText().toString());


            Bagi = angka1 / angka2;
            Tampil.setText(Integer.toString(Bagi));
        }else{
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Bersihkan(View v)
    {
      Tampil.setText("");
      Inputa.setText("");
      Inputb.setText("");
    }
}
