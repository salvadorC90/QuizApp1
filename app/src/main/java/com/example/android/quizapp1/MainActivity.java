package com.example.android.quizapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;



import static com.example.android.quizapp1.R.id.answerField1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void itemClicked(View v){
        if (((RadioButton)v).isChecked()){
            Toast.makeText(this,"is it working", Toast.LENGTH_LONG).show();
        }
    }

}
