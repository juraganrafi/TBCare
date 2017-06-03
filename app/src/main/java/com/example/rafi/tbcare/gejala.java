package com.example.rafi.tbcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.example.rafi.splashscreen.R;

import static com.example.rafi.splashscreen.R.layout.activity_pencegah;

public class gejala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala);

        ImageView btnBack = (ImageView) findViewById(R.id.btn_kembali);
        ImageView btnNext = (ImageView) findViewById(R.id.btn_selanjutnya);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent= new Intent(gejala.this, pencegah.class);
                startActivity(intent);


            }
        });
    }
}
