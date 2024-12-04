package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Legs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
    }
    public void easy_Legs(View view) {
        Intent intent = new Intent(this, Easy_Legs.class);
        startActivity(intent);
    }

    public void moderate_Legs(View view) {
        Intent intent = new Intent(this, Normal_Legs.class);
        startActivity(intent);

    }
    public void hard_Legs(View view) {
        Intent intent = new Intent(this, Hard_Legs.class);
        startActivity(intent);

    }
    public void onBackButtonClicked(View view) {
        finish(); // Ends the current activity and returns to the previous one
    }
}