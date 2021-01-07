package com.example.colorapp;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.util.Random;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    private int[] colors;
    private View windowView;
    private Button tryMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tryMe = (Button) findViewById(R.id.tryMe);
        tryMe.setText(R.string.try_me);

        windowView =  findViewById(R.id.windowView);

        colors = new int[]{Color.RED,Color.BLUE, Color.CYAN,Color.GREEN,Color.BLACK, Color.DKGRAY,Color.GRAY,Color.LTGRAY,Color.MAGENTA,Color.YELLOW};

        tryMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int randomNumber = random.nextInt(colors.length);
                windowView.setBackgroundColor(colors[randomNumber]);
                Log.d("Random",String.valueOf(randomNumber));
            }
        });
    }



} 