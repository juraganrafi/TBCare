package com.example.rafi.tbcare;

/**
 * Created by rafi on 01/12/16.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

import com.example.rafi.splashscreen.R;

public class ApaItu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apa_itu);

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
                Intent intent= new Intent(ApaItu.this, cara_penularan.class);
                startActivity(intent);
            }
        });
    }
}
