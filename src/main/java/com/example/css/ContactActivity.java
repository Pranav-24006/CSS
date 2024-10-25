package com.example.css;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactActivity extends AppCompatActivity {
    ImageView pic;
    TextView text;
    int curr=1;
    //1->2->3->4->5->6->7->8->1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        pic = findViewById(R.id.pic1);  // Assuming pic1 is the initial visible image
        pic.setAlpha(1f);
//        for (int i = 2; i <= 8; i++) {
//            @SuppressLint("DiscouragedApi") int id = getResources().getIdentifier("pic" + i, "id", getPackageName());
//            ImageView img = findViewById(id);
//            img.setAlpha(0f);
//            img.setVisibility(View.GONE);
//        }
    }
    public void home(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        this.finish();
    }
    public void prev(View view){
        Intent intent  = new Intent(this,AboutActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void prevpic(View view) {
        Log.d("ContactActivity","MEOW!");
        String idX = "pic" + curr;
        int x = getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);
        pic.setVisibility(View.GONE);  // Hide the current image

        if (curr != 1) {
            curr--;
        } else {
            curr = 8;
        }

        String idY = "pic" + curr;
        int y = getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        pic.setVisibility(View.VISIBLE);  // Show the previous image
    }

    public void nextpic(View view) {
        Log.d("ContactActivity","MEOW!");
        String idX = "pic" + curr;
        int x = getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);
        pic.setVisibility(View.GONE);  // Hide the current image

        if (curr != 8) {
            curr++;
        } else {
            curr = 1;
        }

        String idY = "pic" + curr;
        int y = getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        pic.setVisibility(View.VISIBLE);  // Show the next image
    }

}
