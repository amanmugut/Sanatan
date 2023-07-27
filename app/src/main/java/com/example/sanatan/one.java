package com.example.sanatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class one extends AppCompatActivity {
    private ImageView homeicon;
    public CardView cards1;
    public CardView cards2;
    public CardView cards3;

    @Override
    public void onBackPressed() {
        homeicon();
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        homeicon=findViewById(R.id.homeicon);
        cards1 = (CardView) findViewById(R.id.carda1);
        cards2 = (CardView) findViewById(R.id.carda2);
        cards3 = (CardView) findViewById(R.id.carda3);
        cards1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cards1();
            }
        });
        cards2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cards2();
            }
        });
        cards3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cards3();
            }
        });
        homeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeicon();
            }
        });

    }
    public void cards1(){
        Intent i = new Intent(this, ganeshaartione.class);
        startActivity(i);
    }
    public void cards2(){
        Intent i = new Intent(this, ganeshaartitwo.class);
        startActivity(i);
    }
    public void cards3(){
        Intent i = new Intent(this, ganeshartithree.class);
        startActivity(i);
    }
    public void homeicon(){
        Intent intent = new Intent(this,Homemain.class);
        startActivity(intent);
    }
}