package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import java.math.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button modulus = (Button) findViewById(R.id.modulus);
        Button power = (Button) findViewById(R.id.power);
        Button div = (Button) findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText  number1 = (EditText) findViewById(R.id.number1);
                EditText  number2 = (EditText) findViewById(R.id.number2);
                TextView  result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int btn_result = num1 + num2;
                result.setText(btn_result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText  number1 = (EditText) findViewById(R.id.number1);
                EditText  number2 = (EditText) findViewById(R.id.number2);
                TextView  result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int btn_result = num1 - num2;
                result.setText(btn_result);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText  number1 = (EditText) findViewById(R.id.number1);
                EditText  number2 = (EditText) findViewById(R.id.number2);
                TextView  result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int btn_result = num1 * num2;
                result.setText(btn_result);
            }
        });

        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText  number1 = (EditText) findViewById(R.id.number1);
                EditText  number2 = (EditText) findViewById(R.id.number2);
                TextView  result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int btn_result = num1 / num2;
                result.setText(btn_result);
            }
        });

        modulus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText  number1 = (EditText) findViewById(R.id.number1);
                EditText  number2 = (EditText) findViewById(R.id.number2);
                TextView  result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int btn_result = num1 % num2;
                result.setText(btn_result);
            }
        });

        power.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText  number1 = (EditText) findViewById(R.id.number1);
                EditText  number2 = (EditText) findViewById(R.id.number2);
                TextView  result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                double btn_result = Math.pow(num1,num2);
                result.setText(String.valueOf(btn_result));
            }
        });
    }
}