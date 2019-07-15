package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.opstionmenu,menu);
            return true;
        }

        public boolean onOptionsItemSelected (MenuItem item)
        {
            if (item.getItemId() == R.id.menu1) {
                startActivity(new Intent(this, internal.class));
            }
            else if (item.getItemId() == R.id.menu2)
            {
                startActivity(new Intent (this,eksternal.class));
            }

            return true;
        }
}