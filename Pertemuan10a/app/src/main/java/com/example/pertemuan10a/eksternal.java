package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class eksternal extends AppCompatActivity {
    public static final String FILENAME = "namafile.text";
    //    Button buatFile, ubahFile, bacaFile, deleteFile;
    TextView textBaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eksternal);
//        buatFile = findViewById(R.id.Btn1);
//        ubahFile = findViewById(R.id.Btn2);
//        bacaFile = findViewById(R.id.Btn3);
//        deleteFile = findViewById(R.id.Btn4);
        textBaca = findViewById(R.id.tampil);

//        buatFile.setOnClickListener(this);
//        ubahFile.setOnClickListener(this);
//        bacaFile.setOnClickListener(this);
//        deleteFile.setOnClickListener(this);

    }
    public void buatFile(View v) {
        String isiFile = "Coba Isi Data File Text";


//        File file =  new File(getFilesDir(),FILENAME);
        String kondisi = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }
        File file = new File(getExternalFilesDir(null), FILENAME);
        FileOutputStream outputStream = null;
        try
        {
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void ubahFile(View v) {
        String ubah = "Update Isi Data File Text";
        File file = new File(getExternalFilesDir(null), FILENAME);
        FileOutputStream outputStream = null;
        try
        {
            file.createNewFile();
            outputStream = new FileOutputStream(file, false);
            outputStream.write(ubah.getBytes());
            outputStream.flush();
            outputStream.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void bacaFile(View v){
        File sdcard = Environment.getExternalStorageDirectory();
        File file = new File(sdcard, FILENAME);
        if (file.exists()){
            StringBuilder text = new StringBuilder();
            try{
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = br.readLine();
                while (line != null){
                    text.append(line);
                    line = br.readLine();
                }br.close();
            }catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
            textBaca.setText(text.toString());
        }
    }

    public void hapusFile(View v){
        File file = new File(getFilesDir(), FILENAME);
        if (file.exists()){
            file.delete();
        }
    }

//    @Override
//    public void onClick(View v)
//    {
//        jalankanPerintah(v.getId());
//    }
//    public void jalankanPerintah(int id){
//        switch (id){
//            case R.id.Btn1;
//            buatFile();
//            break;
//            case R.id.Btn2;
//            bacaFile();
//            break;
//            case R.id.Btn3;
//                ubahFile();
//                break;
//            case R.id.Btn4;
//                hapusFile();
//                break;
//        }
//    }
}