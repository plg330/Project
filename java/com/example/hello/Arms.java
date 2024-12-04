package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Arms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);
    }
    public void easy_Arms(View view) {
        Intent intent = new Intent(this, Easy_Bicep.class);
        startActivity(intent);
    }

    public void moderate_Arms(View view) {
        Intent intent = new Intent(this, Normal_Bicep.class);
        startActivity(intent);

    }
    public void hard_Arms(View view) {
        Intent intent = new Intent(this, Hard_Bicep.class);
        startActivity(intent);

    }
    public void onBackButtonClicked(View view) {
        finish(); // Ends the current activity and returns to the previous one
    }
}