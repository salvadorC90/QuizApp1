package com.example.android.quizapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.quizapp1.R.id.answer3B;
import static com.example.android.quizapp1.R.id.answerField;


public class MainActivity extends AppCompatActivity {
    double score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitQuiz(View v) {
        //Question 1
        RadioButton answer1A = (RadioButton) findViewById(R.id.answer1A);

        if (answer1A.isChecked()) {
            score += 1;
        } else {
            score += 0;
        }

        //Question 2
        RadioButton answer2C = (RadioButton) findViewById(R.id.answer2C);

        if (answer2C.isChecked()) {
            score += 1;
        } else {
            score += 0;
        }

        //Question 3
        CheckBox answer3A = (CheckBox) findViewById(R.id.answer3A);
        CheckBox answer3B = (CheckBox) findViewById(R.id.answer3B);
        CheckBox answer3C = (CheckBox) findViewById(R.id.answer3C);
        CheckBox answer3D = (CheckBox) findViewById(R.id.answer3D);

        if (answer3A.isChecked() && answer3C.isChecked() && !(answer3B.isChecked()) && !(answer3D.isChecked())) {
            score += 1;
        } else {
            score += 0;
        }


        //Question 4
        EditText question4Answer = (EditText) findViewById(answerField);
        String answerField = question4Answer.getText().toString();
        if (answerField.equals("the")) {
            score += 1;
        } else {
            score += 0;
        }


        //total score

        Toast.makeText(this, "your score is " + score + " out of 4.0", Toast.LENGTH_SHORT).show();
        score = 0;
    }
}
