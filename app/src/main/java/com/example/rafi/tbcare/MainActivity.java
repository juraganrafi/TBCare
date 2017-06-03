package com.example.rafi.tbcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.rafi.splashscreen.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btnBack =(Button) findViewById(R.id.btn_kembali);
        ImageView btnNext = (ImageView) findViewById(R.id.btn_selanjutnya);

        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View MainActivity) {
                Intent intent= new Intent(MainActivity.this, ApaItu.class);
                startActivity(intent);
            }
        });
    }
}
