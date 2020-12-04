package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.GRAY, Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.LTGRAY, Color.MAGENTA, Color.CYAN};

        windowView = findViewById(R.id.windowViewId);

        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);
                windowView.setBackgroundColor(colors[randomNum]);
                Log.d("Random", String.valueOf(randomNum));

            }
        });
    }
}