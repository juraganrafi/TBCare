package com.example.rafi.tbcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rafi.splashscreen.R;

public class cara_penularan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_penularan);

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
                Intent intent= new Intent(cara_penularan.this, gejala.class);
                startActivity(intent);
            }
        });
    }
}