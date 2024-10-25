package com.example.css;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void home(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
    public void prev(View view){
        Intent intent  = new Intent(this,EventActivity.class);
        startActivity(intent);
        this.finish();
    }
    public void next(View view){
        Intent intent = new Intent(this,ContactActivity.class);
        startActivity(intent);
        this.finish();
    }
}