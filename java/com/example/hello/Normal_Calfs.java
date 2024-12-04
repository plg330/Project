package com.example.hello;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Normal_Calfs extends AppCompatActivity {

    private ImageView imageView;
    private Button arrowButton;
    private Button newButton;
    private TextView textView;
    private int currentIndex = 0;
    private int currentSetIndex = 0; // To track which image set is currently active
    private boolean isAlternating = false; // To track dif alternating is in progress
    private Handler handler = new Handler();

    // Image sets
    private int[][] allImages = {
            { R.drawable.standing_calf_raise,  R.drawable.standing_calf_raise_up}, // images1
            { R.drawable.donkey_calf_raise_rest, R.drawable.donkey_calf_raise_up},     // images2
            { R.drawable.jump_squat_rest, R.drawable.jump_squat_up}, // images3
    };

    // Text sets (reduced to one text per set)
    private String[] allTexts = {
            "CALF RAISE HOLD 1S 20X4",
            "DONKEY CALF RAISE 15X4",
            "JUMP SQUAT 45S"
    };

    private int[] currentImages;
    private String currentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);

        imageView = findViewById(R.id.imageView);
        arrowButton = findViewById(R.id.arrowButton);
        newButton = findViewById(R.id.newButton);
        textView = findViewById(R.id.textView);

        // Initial setup
        setImageSet(0); // Start with the first set

        // Set up click listener for the arrow button
        arrowButton.setOnClickListener(v -> {
            // Cycle through image sets (0 -> 1 -> 2 -> 0 ...)
            currentSetIndex = (currentSetIndex + 1) % allImages.length;
            setImageSet(currentSetIndex);
        });

        // Set up click listener for the new button
        newButton.setOnClickListener(v -> startAlternatingImages());
    }

    private void setImageSet(int setIndex) {
        currentImages = allImages[setIndex];
        currentText = allTexts[setIndex];
        currentIndex = 0; // Reset to the first image of the new set
        imageView.setImageResource(currentImages[currentIndex]);
        textView.setText(currentText);
    }

    private void startAlternatingImages() {
        isAlternating = true;
        final int[] iterationCount = {0};
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (iterationCount[0] < 20) { // 10 iterations for 5 pairs (5 times alternating between 0 and 1)
                    currentIndex = iterationCount[0] % 2; // Alternate between the two images of the current set
                    imageView.setImageResource(currentImages[currentIndex]);
                    iterationCount[0]++;
                    handler.postDelayed(this, 200); // 0.20 seconds delay
                } else {
                    // Reset after alternating
                    iterationCount[0] = 0;
                }
            }
        };
        handler.post(runnable); // Start the alternating process
    }
}