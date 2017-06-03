package com.example.rafi.tbcare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.rafi.splashscreen.R;

public class pencegah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencegah);

        ImageView btnBack = (ImageView) findViewById(R.id.btn_kembali);
        //ImageView btnNext = (ImageView) findViewById(R.id.btn_selanjutnya);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
