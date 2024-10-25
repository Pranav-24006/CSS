package com.example.css;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }
    public void second(View view){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
        this.finish();
    }
    public void home(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}