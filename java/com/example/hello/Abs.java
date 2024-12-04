package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
    }
    public void easy_Abs(View view) {
        Intent intent = new Intent(this, Easy_Abs.class);
        startActivity(intent);
    }

    public void moderate_Abs(View view) {
        Intent intent = new Intent(this, Normal_Abs.class);
        startActivity(intent);

    }
    public void hard_Abs(View view) {
        Intent intent = new Intent(this, Hard_Abs.class);
        startActivity(intent);

    }
    public void onBackButtonClicked(View view) {
        finish(); // Ends the current activity and returns to the previous one
    }
}