package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Variable to hold the amount of correct answers.
     */
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Method to record correct answer for question 1.
     */
    public void questionOne() {

        RadioButton rbOne = findViewById(R.id.question_1_correct);

        if (rbOne.isChecked()) {
            correctAnswers++;
        }
    }

    /**
     * Method to record correct answer for question 2.
     */
    public void questionTwo() {

        RadioButton rbTwo = findViewById(R.id.question_2_correct);

        if (rbTwo.isChecked()) {
            correctAnswers++;
        }
    }

    /**
     * Method to record correct answer for question 3.
     */
    public void questionThree() {

        CheckBox cb1 = findViewById(R.id.Ethernet);
        CheckBox cb2 = findViewById(R.id.Crosstalk);
        CheckBox cb3 = findViewById(R.id.Shorts);
        CheckBox cb4 = findViewById(R.id.DnsConfigarations);
        CheckBox cb5 = findViewById(R.id.Impedance);

        if (!cb1.isChecked() && !cb4.isChecked() && (cb2.isChecked() && cb3.isChecked() && cb5.isChecked())) {
            correctAnswers++;
        }
    }

    /**
     * Method to record correct answer for question 4.
     */
    public void questionFour() {

        RadioButton rbFour = findViewById(R.id.question_4_correct);

        if (rbFour.isChecked()) {
            correctAnswers++;
        }
    }

    /**
     * Compile answers.
     */

    public void compileAnswers() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
    }

    /**
     * Method to display question results in a toast message.
     */
    public void submitAnswers(View view) {

        compileAnswers();

        EditText userName = findViewById(R.id.name_text_input);
        String name = userName.getText().toString();

        String resultsMessage = name + ", You got " + correctAnswers + " out of 4 answers correct.";
        Toast.makeText(this, resultsMessage, Toast.LENGTH_LONG).show();

    }
}