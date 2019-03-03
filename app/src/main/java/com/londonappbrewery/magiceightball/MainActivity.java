package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballDisplay;
        ballDisplay = findViewById(R.id.image_eightBall);

        ImageView ballArray;
        ballArray = findViewById(R.drawable.ball1);
        ballArray = findViewById(R.drawable.ball2);
        ballArray = findViewById(R.drawable.ball3);
        ballArray = findViewById(R.drawable.ball4);
        ballArray = findViewById(R.drawable.ball5);

        Button askButton;
        askButton = findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Ask Button", "The button has been pressed");
            }
        });
    }
}
