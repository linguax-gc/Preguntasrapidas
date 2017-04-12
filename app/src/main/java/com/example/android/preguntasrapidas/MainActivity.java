package com.example.android.preguntasrapidas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void grade(View view) {
        /**
         * Sets grade variable to 0
         */
        int finalGrade = 0;
        /**
         * Creates booleans for Question 1
         */
        CheckBox CB1_1 = (CheckBox) findViewById(R.id.checkbox1_1);
        boolean CB1_1Checked = CB1_1.isChecked();
        CheckBox CB1_2 = (CheckBox) findViewById(R.id.checkbox1_2);
        boolean CB1_2Checked = CB1_2.isChecked();
        CheckBox CB1_3 = (CheckBox) findViewById(R.id.checkbox1_3);
        boolean CB1_3Checked = CB1_3.isChecked();
        CheckBox CB1_4 = (CheckBox) findViewById(R.id.checkbox1_4);
        boolean CB1_4Checked = CB1_4.isChecked();
        CheckBox CB1_5 = (CheckBox) findViewById(R.id.checkbox1_5);
        boolean CB1_5Checked = CB1_5.isChecked();
        /**
         * Grades Question 1
         */
        if (CB1_1Checked && CB1_4Checked && CB1_5Checked && !CB1_2Checked && !CB1_3Checked) {
            finalGrade += 1;
        }
        /**
         * Creates booleans for Question 2
         */
        CheckBox CB2_1 = (CheckBox) findViewById(R.id.checkbox2_1);
        boolean CB2_1Checked = CB2_1.isChecked();
        CheckBox CB2_2 = (CheckBox) findViewById(R.id.checkbox2_2);
        boolean CB2_2Checked = CB2_2.isChecked();
        CheckBox CB2_3 = (CheckBox) findViewById(R.id.checkbox2_3);
        boolean CB2_3Checked = CB2_3.isChecked();
        CheckBox CB2_4 = (CheckBox) findViewById(R.id.checkbox2_4);
        boolean CB2_4Checked = CB2_4.isChecked();
        CheckBox CB2_5 = (CheckBox) findViewById(R.id.checkbox2_5);
        boolean CB2_5Checked = CB2_5.isChecked();
        /**
         * Grades Question 2
         */
        if (CB2_1Checked && CB2_2Checked && CB2_5Checked && !CB2_3Checked & !CB2_4Checked) {
            finalGrade += 1;
        }
        /**
         * Creates boolean for Question 3
         */
        RadioButton RB3_2 = (RadioButton) findViewById(R.id.radio3_2);
        boolean RB3_2Checked = RB3_2.isChecked();
        /**
         * Grades Question 3
         */
        if (RB3_2Checked) {
            finalGrade += 1;
        }
        /**
         * Creates boolean for Question 4
         */
        RadioButton RB4_2 = (RadioButton) findViewById(R.id.radio4_2);
        boolean RB4_2Checked = RB4_2.isChecked();
        /**
         * Grades Question 3
         */
        if (RB4_2Checked) {
            finalGrade += 1;
        }
        /**
         * Creates boolean for Question 5
         */
        EditText question5 = (EditText) findViewById(R.id.editText1_answer);
        /**
         * Grades Question 5
         */
        if (question5.getText().toString().equals("tu gato no es simpático")) {
            finalGrade += 1;
        }
        /**
         * Creates boolean for Question 6
         */
        EditText question6 = (EditText) findViewById(R.id.editText2_answer);
        /**
         * Grades Question 6
         */
        if (question6.getText().toString().equals("a mi amigo no le gusta el café")) {
            finalGrade += 1;
        }
        String gradeMessage = "You got " + finalGrade + " correct answers!";
        Toast.makeText(this, gradeMessage, Toast.LENGTH_SHORT).show();
    }

}
