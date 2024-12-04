package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class Main_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button button1 = findViewById(R.id.pet);
        Button button2 = findViewById(R.id.work);

        // Set click listener for the first button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Screen.this, Pet_Game.class);
                startActivity(intent);
            }
        });

        // Set click listener for the second button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Directly navigate to MainActivity without action
                Intent intent = new Intent(Main_Screen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void openActivity(String action) {
        Intent intent = new Intent(Main_Screen.this, MainActivity.class);
        intent.putExtra("action", action);
        startActivity(intent);
    }


}
