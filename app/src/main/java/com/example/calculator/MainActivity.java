package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,point,modulo,multiply,division,equals,All_Clear,addition,subtraction;
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        modulo  = findViewById(R.id.modulo);
        point   = findViewById(R.id.point);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);
        equals = findViewById(R.id.equals);
        All_Clear = findViewById(R.id.All_Clear);
        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);


    }
}