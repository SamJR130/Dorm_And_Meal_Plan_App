package com.hfad.dormandmealplanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * This class demonstrates a calculation based on selections from two spinners.
 * @Samantha Rindgen
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create access to buttons, spinners, and text views
        Button btnCalculate = (Button) findViewById(R.id.btn_calculate);
        TextView txtDormNamesLabel = (TextView) findViewById(R.id.txt_dorm);
        TextView txtMealPlanLabel = (TextView) findViewById(R.id.txt_meal);
        TextView txtCalculation = (TextView) findViewById(R.id.txt_result);
        Spinner spDormNames = (Spinner) findViewById(R.id.sp_dorm);
        Spinner spMealPlans = (Spinner) findViewById(R.id.sp_meal);

        //Create an on click listener for our calculate button
        btnCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String dorm = spDormNames.getSelectedItem().toString();
                String meal = spMealPlans.getSelectedItem().toString();

                txtCalculation.setText(calculate(dorm, meal));
            }
        });
    }

    public String calculate(String dorm, String meal) {

        double result;
        String resultText = " ";
        if (dorm.equals("Allen Hall")) {
            //If meal plan is 7 meals for week
            if (meal.equals("7 meals per week")) {
                result = 1800 + 600;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is 14 meals for week
            else if (meal.equals("14 meals per week")) {
                result = 1800 + 1100;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is unlimited meals for week
            else if (meal.equals("Unlimited meals per week")) {
                result = 1800 + 1800;
                resultText = String.format("$%,.2f", result);
            }
        }

        //If Pike Hall is the selected dorm
        if (dorm.equals("Pike Hall")) {
            //If meal plan is 7 meals for week
            if (meal.equals("7 meals per week")) {
                result = 2200 + 600;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is 14 meals for week
            else if (meal.equals("14 meals per week")) {
                result = 2200 + 1100;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is unlimited meals for week
            else if (meal.equals("Unlimited meals per week")) {
                result = 2200 + 1800;
                resultText = String.format("$%,.2f", result);
            }
        }

        //If Farthing Hall is the selected dorm
        if (dorm.equals("Farthing Hall")) {
            //If meal plan is 7 meals for week
            if (meal.equals("7 meals per week")) {
                result = 2800 + 600;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is 14 meals for week
            else if (meal.equals("14 meals per week")) {
                result = 2800 + 1100;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is unlimited meals for week
            else if (meal.equals("Unlimited meals per week")) {
                result = 2800 + 1800;
                resultText = String.format("$%,.2f", result);
            }
        }

        //If University Suites is the selected dorm
        if (dorm.equals("University Suites")) {
            //If meal plan is 7 meals for week
            if (meal.equals("7 meals per week")) {
                result = 3000 + 600;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is 14 meals for week
            else if (meal.equals("14 meals per week")) {
                result = 3000 + 1100;
                resultText = String.format("$%,.2f", result);
            }

            //If meal plan is unlimited meals for week
            else if (meal.equals("Unlimited meals per week")) {
                result = 3000 + 1800;
                resultText = String.format("$%,.2f", result);
            }
        }
        return resultText;
    }

}