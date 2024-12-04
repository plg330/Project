package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
    }
    public void easy_Back(View view) {
        Intent intent = new Intent(this, Easy_Back.class);
        startActivity(intent);
    }

    public void moderate_Back(View view) {
        Intent intent = new Intent(this, Normal_Back.class);
        startActivity(intent);

    }
    public void hard_Back(View view) {
        Intent intent = new Intent(this, Hard_Back.class);
        startActivity(intent);

    }
    public void onBackButtonClicked(View view) {
        finish(); // Ends the current activity and returns to the previous one
    }
}