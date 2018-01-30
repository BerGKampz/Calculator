package com.example.poly.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText EditText_1;
    private EditText EditText_2;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText_1 = findViewById(R.id.EditText_1);
        EditText_2 = findViewById(R.id.EditText_2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(EditText_1.getText().toString());
                int number2=Integer.parseInt(EditText_2.getText().toString());
                Plus(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf( Plus(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(EditText_1.getText().toString());
                int number2=Integer.parseInt(EditText_2.getText().toString());
                Minus(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf( Minus(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(EditText_1.getText().toString());
                int number2=Integer.parseInt(EditText_2.getText().toString());
                Multiply(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf( Multiply(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(EditText_1.getText().toString());
                int number2=Integer.parseInt(EditText_2.getText().toString());
                Divide(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf( Divide(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int Plus(int number1, int number2){
        return number1+number2;
    }
    private int Minus(int number1, int number2){
        int sum = number1-number2;
        return sum;
    }
    private int Multiply(int number1, int number2){
        int sum = number1*number2;
        return sum;
    }
    private int Divide(int number1, int number2) {
        if (number2 == 0) {
            return 0;
        } else
            return number1/number2;

    }
}

