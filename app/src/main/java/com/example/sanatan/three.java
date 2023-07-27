package com.example.sanatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class three extends AppCompatActivity {
    private ImageView homeicon;
    private CardView cardb1;
    private CardView cardb2;
    private CardView cardb3;
    @Override
    public void onBackPressed() {
        homeicon();
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_three2);

        homeicon=findViewById(R.id.homeicon);
        cardb1=findViewById(R.id.cardb1);
        cardb2=findViewById(R.id.cardb2);
        cardb3=findViewById(R.id.cardb3);
        cardb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardb1();
            }
        });
        cardb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardb2();
            }
        });
        cardb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardb3();
            }
        });
        homeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeicon();
            }
        });
    }
    public void homeicon(){
        Intent intent = new Intent(this,Homemain.class);
        startActivity(intent);
    }
    public void cardb1(){
        Intent intent = new Intent(this,santkhatushyamji.class);
        startActivity(intent);
    }
    public void cardb2(){
        Intent intent = new Intent(this,santsaibaba.class);
        startActivity(intent);
    }
    public void cardb3(){
        Intent intent = new Intent(this,santmahavirji.class);
        startActivity(intent);
    }
}