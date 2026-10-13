package com.example.quizappbm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScoreActivity extends AppCompatActivity {
    TextView questionScoreTV;
    Intent qScore;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        questionScoreTV = findViewById(R.id.questionScore);
        qScore = getIntent();
       score= qScore.getIntExtra("Score",0);
       questionScoreTV.setText("score "+score+"/10");
    }
}