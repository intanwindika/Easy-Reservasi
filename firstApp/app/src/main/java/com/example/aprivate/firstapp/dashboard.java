package com.example.aprivate.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    Button btnLogin,btnRegistrasi,btnHotel,btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btnHotel= (Button) findViewById(R.id.btn_hotel);
        btnAbout= (Button) findViewById(R.id.btn_about);
        btnLogin= (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1= new Intent(dashboard.this, second.class);
                startActivity(inten1);
            }
        });

        btnRegistrasi=(Button) findViewById(R.id.btn_registrasi);
        btnRegistrasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent inten1= new Intent(dashboard.this, MainActivity.class);
                startActivity(inten1);
            }
        });
    }
}
