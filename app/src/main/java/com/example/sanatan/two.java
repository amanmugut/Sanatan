package com.example.sanatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class two extends AppCompatActivity {
    private ImageView homeicon;
    private CardView carda1;
    private CardView carda2;
    private CardView carda3;
    private CardView carda4;
    private CardView carda5;
    private CardView carda6;
    @Override
    public void onBackPressed() {
        homeicon();
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_two2);

        homeicon=findViewById(R.id.homeicon);
        carda1=findViewById(R.id.carda1);
        carda2=findViewById(R.id.carda2);
        carda3=findViewById(R.id.carda3);
        carda4=findViewById(R.id.carda4);
        carda5=findViewById(R.id.carda5);
        carda6=findViewById(R.id.carda6);
        carda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carda1();
            }
        });
        carda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carda2();
            }
        });
        carda3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carda3();
            }
        });
        carda4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carda4();
            }
        });
        carda5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carda5();
            }
        });
        carda6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carda6();
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
    public void carda1(){
        Intent intent = new Intent(this,godsaartihanumanji.class);
        startActivity(intent);
    }
    public void carda2(){
        Intent intent = new Intent(this,godsaartikrishnaji.class);
        startActivity(intent);
    }
    public void carda3(){
        Intent intent = new Intent(this,godsaartibankeji.class);
        startActivity(intent);
    }
    public void carda4(){
        Intent intent = new Intent(this,godshreeramji.class);
        startActivity(intent);
    }
    public void carda5(){
        Intent intent = new Intent(this,godramji.class);
        startActivity(intent);
    }
    public void carda6(){
        Intent intent = new Intent(this,godshivaji.class);
        startActivity(intent);
    }
}