package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Load activity_main.xml
    }
    public void openShoulders(View view) {
        Intent intent = new Intent(this, Shoulders.class);
        startActivity(intent);
    }

    public void openArms(View view) {
        Intent intent = new Intent(this, Arms.class);
        startActivity(intent);

    }
    public void openBack(View view) {
        Intent intent = new Intent(this, Back.class);
        startActivity(intent);

    }
    public void openChest(View view) {
        Intent intent = new Intent(this, Chest.class);
        startActivity(intent);

    }
    public void openAbs(View view) {
        Intent intent = new Intent(this, Abs.class);
        startActivity(intent);

    }
    public void openLegs(View view) {
        Intent intent = new Intent(this, Legs.class);
        startActivity(intent);

    }
    public void openCalfs(View view) {
        Intent intent = new Intent(this, Calfs.class);
        startActivity(intent);

    }
    public void openTricep(View view) {
        Intent intent = new Intent(this, Tricep.class);
        startActivity(intent);

    }
}
