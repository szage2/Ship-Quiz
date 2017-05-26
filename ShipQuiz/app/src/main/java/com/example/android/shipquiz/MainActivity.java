package com.example.android.shipquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This app is a quiz consists of 10 questions (3 question types:
 * EditText, RadioGroup and CheckBox).
 * Displays the score and the level of knowledge in a Toast message after submission.
 * For restart push reset Button.
 */
public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private int countSubmission = 0;


    private RadioGroup radioGroup3;
    private RadioGroup radioGroup7;
    private RadioGroup radioGroup8;
    private RadioGroup radioGroup10;
    private RadioButton questionThreeOptionA;
    private RadioButton questionThreeOptionB;
    private RadioButton questionThreeOptionC;
    private RadioButton questionSevenOptionA;
    private RadioButton questionSevenOptionB;
    private RadioButton questionSevenOptionC;
    private RadioButton questionEightOptionA;
    private RadioButton questionEightOptionB;
    private RadioButton questionEightOptionC;
    private RadioButton questionTenOptionA;
    private RadioButton questionTenOptionB;
    private RadioButton questionTenOptionC;
    private CheckBox questionTwoOptionA;
    private CheckBox questionTwoOptionB;
    private CheckBox questionTwoOptionC;
    private CheckBox questionTwoOptionD;
    private CheckBox questionTwoOptionE;
    private CheckBox questionTwoOptionF;
    private CheckBox questionFiveOptionA;
    private CheckBox questionFiveOptionB;
    private CheckBox questionFiveOptionC;
    private CheckBox questionFiveOptionD;
    private CheckBox questionFiveOptionE;
    private CheckBox questionFiveOptionF;
    private EditText rawTextOne;
    private EditText rawTextFour;
    private EditText rawTextSix;
    private EditText rawTextNine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = 0;
        countSubmission = 0;
    }

    /** This method is called when the submit button is clicked the quiz.
     * It checks the answers, evaluate the outcome with a grading logic of 3 levels
     * and mark correct(green) and incorrect(red) answers*/
    public void onSubmit(View v) {

        countSubmission += 1;

       /** Code for EditText
        * Q#1, Q#4, Q#6, Q#9 */

        //Answer for question # 1
        rawTextOne = (EditText) findViewById(R.id.raw_text_one);
        String answerForFirst = rawTextOne.getText().toString();
        String solutionForFirst = getString(R.string.question_1_solution);
        if (answerForFirst.equals(solutionForFirst)) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            rawTextOne.setTextColor(Color.GREEN);
        }else{
            // change option's text color
            rawTextOne.setTextColor(Color.RED);
        }

        //Answer for question # 4
        rawTextFour = (EditText) findViewById(R.id.raw_text_four);
        String answerForFourth = rawTextFour.getText().toString();
        String solutionForFourth = getString(R.string.question_4_solution);
        if (answerForFourth.equals(solutionForFourth)) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            rawTextFour.setTextColor(Color.GREEN);
        }else{
            // change option's text color
            rawTextFour.setTextColor(Color.RED);
        }

        //Answer for question # 6
        rawTextSix = (EditText) findViewById(R.id.raw_text_six);
        String answerForSixth = rawTextSix.getText().toString();
        String solutionForSixth = getString(R.string.question_6_solution);
        if (answerForSixth.equals(solutionForSixth)) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            rawTextSix.setTextColor(Color.GREEN);
        }else{
            // change option's text color
            rawTextSix.setTextColor(Color.RED);
        }

        //Answer for question # 9
        rawTextNine = (EditText) findViewById(R.id.raw_text_nine);
        String answerForNinth = rawTextNine.getText().toString();
        String solutionForNinth = getString(R.string.question_9_solution);
        if (answerForNinth.equals(solutionForNinth)) {
            // Increase the score by 1
            score += 1;
            rawTextNine.setTextColor(Color.GREEN);
            // change option's text color
        }else{
            rawTextNine.setTextColor(Color.RED);
            // change option's text color
        }

        /** Code for CheckBox
         * Q#2, Q#5, */

        questionTwoOptionA = (CheckBox) findViewById(R.id.question_2_option_a);
        // Checked: Question 2 Option A
        boolean checkedQuestionTwoOptionA = questionTwoOptionA.isChecked();

        questionTwoOptionB = (CheckBox) findViewById(R.id.question_2_option_b);
        // Checked: Question 2 Option B
        boolean checkedQuestionTwoOptionB = questionTwoOptionB.isChecked();

        questionTwoOptionC = (CheckBox) findViewById(R.id.question_2_option_c);
        // Checked: Question 2 Option C
        boolean checkedQuestionTwoOptionC = questionTwoOptionC.isChecked();

        questionTwoOptionD = (CheckBox) findViewById(R.id.question_2_option_d);
        // Checked: Question 2 Option D
        boolean checkedQuestionTwoOptionD = questionTwoOptionD.isChecked();

        questionTwoOptionE = (CheckBox) findViewById(R.id.question_2_option_e);
        // Checked: Question 2 Option E
        boolean checkedQuestionTwoOptionE = questionTwoOptionE.isChecked();

        questionTwoOptionF = (CheckBox) findViewById(R.id.question_2_option_f);
        // Checked: Question 2 Option F
        boolean checkedQuestionTwoOptionF = questionTwoOptionF.isChecked();

        questionFiveOptionA = (CheckBox) findViewById(R.id.question_5_option_a);
        // Checked: Question 5 Option A
        boolean checkedQuestionFiveOptionA = questionFiveOptionA.isChecked();

        questionFiveOptionB = (CheckBox) findViewById(R.id.question_5_option_b);
        // Checked: Question 5 Option B
        boolean checkedQuestionFiveOptionB = questionFiveOptionB.isChecked();

        questionFiveOptionC = (CheckBox) findViewById(R.id.question_5_option_c);
        // Checked: Question 5 Option C
        boolean checkedQuestionFiveOptionC = questionFiveOptionC.isChecked();

        questionFiveOptionD = (CheckBox) findViewById(R.id.question_5_option_d);
        // Checked: Question 5 Option D
        boolean checkedQuestionFiveOptionD = questionFiveOptionD.isChecked();

        questionFiveOptionE = (CheckBox) findViewById(R.id.question_5_option_e);
        // Checked: Question 5 Option E
        boolean checkedQuestionFiveOptionE = questionFiveOptionE.isChecked();

        questionFiveOptionF = (CheckBox) findViewById(R.id.question_5_option_f);
        // Checked: Question 5 Option F
        boolean checkedQuestionFiveOptionF = questionFiveOptionF.isChecked();

        // Conditions for question # 2 - checkboxes
        if (checkedQuestionTwoOptionA) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionTwoOptionA.setTextColor(Color.GREEN);
        }
        if (checkedQuestionTwoOptionB) {
            // Decrease the score by 1
            score -= 1;
            // change option's text color
            questionTwoOptionB.setTextColor(Color.RED);
        }
        if (checkedQuestionTwoOptionC) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionTwoOptionC.setTextColor(Color.GREEN);
        }
        if (checkedQuestionTwoOptionD) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionTwoOptionD.setTextColor(Color.GREEN);
        }
        if (checkedQuestionTwoOptionE) {
            // Decrease the score by 1
            score -= 1;
            // change option's text color
            questionTwoOptionE.setTextColor(Color.RED);
        }
        if (checkedQuestionTwoOptionF) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionTwoOptionF.setTextColor(Color.GREEN);
        }

        // Conditions for question # 5 - checkboxes
        if (checkedQuestionFiveOptionA) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionFiveOptionA.setTextColor(Color.GREEN);
        }
        if (checkedQuestionFiveOptionB) {
            // Decrease the score by 1
            score -= 1;
            // change option's text color
            questionFiveOptionB.setTextColor(Color.RED);
        }
        if (checkedQuestionFiveOptionC) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionFiveOptionC.setTextColor(Color.GREEN);
        }
        if (checkedQuestionFiveOptionD) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionFiveOptionD.setTextColor(Color.GREEN);
        }
        if (checkedQuestionFiveOptionE) {
            // Decrease the score by 1
            score -= 1;
            // change option's text color
            questionFiveOptionE.setTextColor(Color.RED);
        }
        if (checkedQuestionFiveOptionF) {
            // Decrease the score by 1
            score -= 1;
            // change option's text color
            questionFiveOptionF.setTextColor(Color.RED);
        }

        /** Code for RadioGroup
         * Q#3, Q#7, Q#8, Q#10 */

        questionThreeOptionA = (RadioButton)findViewById(R.id.question_3_option_a);
        questionThreeOptionB = (RadioButton)findViewById(R.id.question_3_option_b);
        questionThreeOptionC = (RadioButton)findViewById(R.id.question_3_option_c);
        questionSevenOptionA = (RadioButton)findViewById(R.id.question_7_option_a);
        questionSevenOptionB = (RadioButton)findViewById(R.id.question_7_option_b);
        questionSevenOptionC = (RadioButton)findViewById(R.id.question_7_option_c);
        questionEightOptionA = (RadioButton)findViewById(R.id.question_8_option_a);
        questionEightOptionB = (RadioButton)findViewById(R.id.question_8_option_b);
        questionEightOptionC = (RadioButton)findViewById(R.id.question_8_option_c);
        questionTenOptionA = (RadioButton)findViewById(R.id.question_10_option_a);
        questionTenOptionB = (RadioButton)findViewById(R.id.question_10_option_b);
        questionTenOptionC = (RadioButton)findViewById(R.id.question_10_option_c);

        // Conditions for question # 3 - RadioGroup
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        //Checked: one option of RadioGroup3
        int questionThree = radioGroup3.getCheckedRadioButtonId();

        if (questionThree == R.id.question_3_option_a) {
            // change option's text color
           questionThreeOptionA.setTextColor(Color.RED);
        }
        if (questionThree == R.id.question_3_option_b) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionThreeOptionB.setTextColor(Color.GREEN);
        }
        if (questionThree == R.id.question_3_option_c) {
            // change option's text color
            questionThreeOptionC.setTextColor(Color.RED);
        }

        // Conditions for question # 7 - RadioGroup
        radioGroup7 = (RadioGroup) findViewById(R.id.radioGroup7);
        //Checked: one option of RadioGroup7
        int questionSeven = radioGroup7.getCheckedRadioButtonId();

        if (questionSeven == R.id.question_7_option_a) {
            // change option's text color
            questionSevenOptionA.setTextColor(Color.RED);
        }
        if (questionSeven == R.id.question_7_option_b) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionSevenOptionB.setTextColor(Color.GREEN);
        }
        if (questionSeven == R.id.question_7_option_c) {
            // change option's text color
            questionSevenOptionC.setTextColor(Color.RED);
        }

        // Conditions for question # 8 - RadioGroup
        radioGroup8 = (RadioGroup) findViewById(R.id.radioGroup8);
        //Checked: one option of RadioGroup8
        int questionEight = radioGroup8.getCheckedRadioButtonId();

        if (questionEight == R.id.question_8_option_a) {
            // change option's text color
            questionEightOptionA.setTextColor(Color.RED);
        }
        if (questionEight == R.id.question_8_option_b) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionEightOptionB.setTextColor(Color.GREEN);
        }
        if (questionEight == R.id.question_8_option_c) {
            // change option's text color
            questionEightOptionC.setTextColor(Color.RED);
        }

        // Conditions for question # 10 - RadioGroup
        radioGroup10 = (RadioGroup) findViewById(R.id.radioGroup10);
        //Checked: one option of RadioGroup10
        int questionTen = radioGroup10.getCheckedRadioButtonId();

        if (questionTen == R.id.question_10_option_a) {
            // change option's text color
            questionTenOptionA.setTextColor(Color.RED);
        }
        if (questionTen == R.id.question_10_option_b) {
            // Increase the score by 1
            score += 1;
            // change option's text color
            questionTenOptionB.setTextColor(Color.GREEN);
        }
        if (questionTen == R.id.question_10_option_c) {
            // change option's text color
            questionTenOptionC.setTextColor(Color.RED);
        }

        /**Evaluation --> score
         * Levels --> Novice / Advanced / Master */

        // Conditions for evaluation - levels
        if (score <= 5) {
            // Show Toast message of final Score and level of knowledge
            Toast.makeText(MainActivity.this, "Score: " + score + " out of 15." + " You are on Novice level.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (score <= 10) {
            // Show Toast message of final Score and level of knowledge
            Toast.makeText(MainActivity.this, "Score: " + score + " out of 15." + " You are on Advanced level.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (score <= 15) {
            // Show Toast message of final Score and level of knowledge
            Toast.makeText(MainActivity.this, "Score: " + score + " out of 15."  + " You are on Master level.", Toast.LENGTH_SHORT).show();
        }
    }

    /** Clears all selected radio buttons, uncheck checkboxes and set EditText fields to default,
     * set back options' TextColors to default and provides a Toast message */
    public void onClear(View v) {
        if (countSubmission >= 1) {
            //Show a message about the cleared app.
            Toast.makeText(MainActivity.this, "The quiz is clear, you can start now.", Toast.LENGTH_SHORT).show();
            //Clears RadioButtons
            radioGroup3.clearCheck();
            radioGroup7.clearCheck();
            radioGroup8.clearCheck();
            radioGroup10.clearCheck();
            //Set default text colors
            questionThreeOptionA.setTextColor(Color.WHITE);
            questionThreeOptionB.setTextColor(Color.WHITE);
            questionThreeOptionC.setTextColor(Color.WHITE);
            questionSevenOptionA.setTextColor(Color.WHITE);
            questionSevenOptionB.setTextColor(Color.WHITE);
            questionSevenOptionC.setTextColor(Color.WHITE);
            questionEightOptionA.setTextColor(Color.WHITE);
            questionEightOptionB.setTextColor(Color.WHITE);
            questionEightOptionC.setTextColor(Color.WHITE);
            questionTenOptionA.setTextColor(Color.WHITE);
            questionTenOptionB.setTextColor(Color.WHITE);
            questionTenOptionC.setTextColor(Color.WHITE);

            if (questionTwoOptionA.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionTwoOptionA.toggle();
                questionTwoOptionA.setTextColor(Color.WHITE);
            }
            if (questionTwoOptionB.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionTwoOptionB.toggle();
                questionTwoOptionB.setTextColor(Color.WHITE);
            }
            if (questionTwoOptionC.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionTwoOptionC.toggle();
                questionTwoOptionC.setTextColor(Color.WHITE);
            }
            if (questionTwoOptionD.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionTwoOptionD.toggle();
                questionTwoOptionD.setTextColor(Color.WHITE);
            }
            if (questionTwoOptionE.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionTwoOptionE.toggle();
                questionTwoOptionE.setTextColor(Color.WHITE);
            }
            if (questionTwoOptionF.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionTwoOptionF.toggle();
                questionTwoOptionF.setTextColor(Color.WHITE);
            }
            if (questionFiveOptionA.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionFiveOptionA.toggle();
                questionFiveOptionA.setTextColor(Color.WHITE);
            }
            if (questionFiveOptionB.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionFiveOptionB.toggle();
                questionFiveOptionB.setTextColor(Color.WHITE);
            }
            if (questionFiveOptionC.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionFiveOptionC.toggle();
                questionFiveOptionC.setTextColor(Color.WHITE);
            }
            if (questionFiveOptionD.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionFiveOptionD.toggle();
                questionFiveOptionD.setTextColor(Color.WHITE);
            }
            if (questionFiveOptionE.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionFiveOptionE.toggle();
                questionFiveOptionE.setTextColor(Color.WHITE);
            }
            if (questionFiveOptionF.isChecked()) {
                //Uncheck CheckBox and set default text color
                questionFiveOptionF.toggle();
                questionFiveOptionF.setTextColor(Color.WHITE);
            }
            //Empty EditText fields
            rawTextOne.setText("");
            rawTextOne.setTextColor(Color.WHITE);
            rawTextFour.setText("");
            rawTextFour.setTextColor(Color.WHITE);
            rawTextSix.setText("");
            rawTextSix.setTextColor(Color.WHITE);
            rawTextNine.setText("");
            rawTextNine.setTextColor(Color.WHITE);
            score = 0;
        }else {
            //Show error message when user push reset right after starting the app
            Toast.makeText(MainActivity.this, "No need to reset", Toast.LENGTH_SHORT).show();
        }
    }
}
