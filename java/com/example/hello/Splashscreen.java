package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler; // Correct import

public class Splashscreen extends AppCompatActivity {
    Animation up, down;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splashscreen);

        imageView = findViewById(R.id.projectsplash);
        if (imageView == null) {
            Log.e("Splashscreen", "ImageView projectsplash is null");
        } else {
            up = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.up);
            imageView.setAnimation(up);
        }

        textView = findViewById(R.id.appname);
        if (textView == null) {
            Log.e("Splashscreen", "TextView appname is null");
        } else {
            down = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.down);
            textView.setAnimation(down);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Navigate to Main_Screen instead of MainActivity
                startActivity(new Intent(getApplicationContext(), Main_Screen.class));
                finish(); // Close Splashscreen
            }
        }, 3500); // 3.5 seconds delay

    }
}

