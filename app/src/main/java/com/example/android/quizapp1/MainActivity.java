package com.example.android.quizapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.quizapp1.R.id.answerField;


public class MainActivity extends AppCompatActivity {
    double score = 0;
    int question1 = 0;
    int question2 = 0;
    double question3 = 0;
    double questionAns1 = 0;
    double questionAns2 = 0;
    int question4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitQuiz(View v) {
        //Question 1
        RadioButton answer1A = (RadioButton) findViewById(R.id.answer1A);
        RadioButton answer1B = (RadioButton) findViewById(R.id.answer1B);
        RadioButton answer1C = (RadioButton) findViewById(R.id.answer1C);

        if (answer1A.isChecked()) {
            question1 = 1;
        } else {question1 = 0;}

        //Question 2
        RadioButton answer2A = (RadioButton) findViewById(R.id.answer2A);
        RadioButton answer2B = (RadioButton) findViewById(R.id.answer2B);
        RadioButton answer2C = (RadioButton) findViewById(R.id.answer2C);

        if (answer2C.isChecked()) {
            question2 = 1;
        } else {question2 = 0;}

        //Question 3
        CheckBox answer3A = (CheckBox) findViewById(R.id.answer3A);
        CheckBox answer3B = (CheckBox) findViewById(R.id.answer3B);
        CheckBox answer3C = (CheckBox) findViewById(R.id.answer3C);
        CheckBox answer3D = (CheckBox) findViewById(R.id.answer3D);

        if (answer3A.isChecked()) {
            questionAns1 = .5;
        } else {questionAns1 = 0;}

        if (answer3C.isChecked()) {
            questionAns2 = .5;
        } else {questionAns2 = 0;}

        question3 = questionAns1 + questionAns2;

        //Question 4
        EditText question4Answer = (EditText) findViewById(answerField);
        String answerField = question4Answer.getText().toString();
        if (answerField.equals("poop")) {
            question4 = 1;
        } else { question4 = 0;}


        //total score
        score = question1 + question2 + question3 + question4;
        Toast.makeText(this, "your score is " + score + " out of 4.0", Toast.LENGTH_SHORT).show();

    }
}
