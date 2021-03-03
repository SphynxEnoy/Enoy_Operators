package com.example.enoy_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display =  findViewById(R.id.displayText);

        int birthYear = 2003;
        int birthMonth = 04;
        int birthDay = 16;
        int currentYear = 2021;
        int currentMonth = 3;
        int currentDay = 04;
        int ageInYears, ageInMonths, ageInDays;

        if(birthMonth > currentMonth){
            birthMonth +=12;
            currentYear-= 1;

        }
        if(birthDay > currentDay){
            birthMonth += 12;
            currentDay  -= 1;
        }
        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My exact age is "+ String.valueOf(ageInYears)+"Years"+String.valueOf(ageInMonths)
                +"\nMonths"+String.valueOf(ageInDays)+"Days");
    }
}