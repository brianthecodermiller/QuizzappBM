package com.example.quizappbm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // 1. Declare our variables
    TextView questionNumber,questionText;
    Button nextButton,trueButton,falseButton;
    int score;
    int questionNum;


      Question[] questions;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2. Initalize vars and inflate our UI (user interface) elements
       questionNumber = findViewById(R.id.questionNumber);
        questionText =findViewById(R.id.questionText);
        nextButton = findViewById(R.id.nextButton);
        trueButton=findViewById(R.id. trueButton);
        falseButton=findViewById(R.id.falseButton);
        score= 1;
        questionNum= 0;


                questions = new Question[] {
                new Question("Luke Skywalker is Darth Vader's son.", true),
                new Question("Chewbacca is a Wookiee.", true),
                new Question("Yoda's lightsaber color in Episode II is red.", false),
                new Question("Han Solo was frozen in Carbonite.", true),
                new Question("The Death Star was destroyed by Boba Fett.", false),
                new Question("Princess Leia is Luke Skywalker's sister.", true),
                new Question("R2-D2 is a protocol droid.", false),
                new Question("Darth Maul has a double-bladed lightsaber.", true),
                new Question("Mace Windu wields a purple lightsaber.", true),
                new Question("Stormtroopers always have perfect aim.", false)
        };

        // 3. Do whatever needs to be done
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;
                String text= "Correct!";
                int duration = Toast.LENGTH_SHORT;
                Toast correct =Toast.makeText(MainActivity.this,text,duration);
                correct.show();
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= "Wrong!";
                int duration = Toast.LENGTH_SHORT;
                Toast wrong =Toast.makeText(MainActivity.this,text,duration);
                wrong.show();
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( questionNum > questions.length - 9) {
                    questionNum++;
                } else {
                    Intent intent = new Intent(
                            MainActivity.this, ScoreActivity.class
                    );
                    intent.putExtra("Score", score);
                    startActivity(intent);
                }
            }
        });






    }
}