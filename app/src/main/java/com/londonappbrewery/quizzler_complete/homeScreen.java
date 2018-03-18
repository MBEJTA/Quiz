package com.londonappbrewery.quizzler_complete;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class homeScreen extends AppCompatActivity {
    private static final String TAG = "homeScreen";
    private Button mButton;
    private Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mButton = findViewById(R.id.mQuiz1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuiz1();

            }
        });

        mButton1 = findViewById(R.id.mQuiz2);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuiz2();
            }
        });

    }

    public void openQuiz1() {
        Intent intent = new Intent(this, Quiz1.class );
        startActivity(intent);
    }

    public void openQuiz2() {
        Intent intent = new Intent(this, Quiz2.class);
        startActivity(intent);
    }

}
