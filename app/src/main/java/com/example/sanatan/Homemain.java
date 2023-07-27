package com.example.sanatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Homemain extends AppCompatActivity{
    public CardView card1, card2, card3, card4, card5, card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemain);
        getSupportActionBar().hide();
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.carda4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card1();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card2();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card3();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card4();
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card5();
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card6();
            }
        });
    }
    public void card1(){
        Intent i = new Intent(this, one.class);
        startActivity(i);
        finish();
    }
    public void card2(){
        Intent i = new Intent(this, two.class);
        startActivity(i);
        finish();
    }
    public void card3(){
        Intent i = new Intent(this, three.class);
        startActivity(i);
        finish();
    }
    public void card4(){
        Intent i = new Intent(this, four.class);
        startActivity(i);
        finish();
    }
    public void card5(){
        Toast.makeText(this, "Under Development", Toast.LENGTH_SHORT).show();
    }
    public void card6(){
        Toast.makeText(this, "Under Development", Toast.LENGTH_SHORT).show();
    }
}