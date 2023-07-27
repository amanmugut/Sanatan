package com.example.sanatan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private View rectangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        rectangle = findViewById(R.id.rectangle_3);
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homemain();
            }
        });
    }
    public void homemain(){
        Intent intent = new Intent(this,Homemain.class);
        startActivity(intent);
        finish();
    }
}