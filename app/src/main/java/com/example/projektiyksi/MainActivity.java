package com.example.projektiyksi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inputField1;
    private EditText inputField2;
    private TextView outputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField1 = findViewById(R.id.input1);
        inputField2 = findViewById(R.id.input2);
        outputField = findViewById(R.id.resultField);
        outputField.setPaintFlags(outputField.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void calculateAddition(View view){
        String input1 = inputField1.getText().toString();
        String input2 = inputField2.getText().toString();
        outputField.setTextColor(Color.BLACK);

        boolean isEmpty = checkIfNull(input1, input2);
        if(!isEmpty) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double result = num1 + num2;
            String resultText;
            if (result == Math.floor(result)) {
                resultText = String.format("%.0f", result);
            } else {
                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                resultText = decimalFormat.format(result);
            }
            outputField.setText(resultText);
        }
    }

    public void calculateNegation(View view){
        String input1 = inputField1.getText().toString();
        String input2 = inputField2.getText().toString();

        boolean isEmpty = checkIfNull(input1, input2);
        if(!isEmpty) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double result = num1 - num2;
            String resultText;
            if (result == Math.floor(result)) {
                resultText = String.format("%.0f", result);
            } else {
                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                resultText = decimalFormat.format(result);
            }
            outputField.setText(resultText);
        }
    }

    public void calculateMultiplication(View view){
        String input1 = inputField1.getText().toString();
        String input2 = inputField2.getText().toString();

        boolean isEmpty = checkIfNull(input1, input2);
        if(!isEmpty) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double result = num1 * num2;

            String resultText;
            if (result == Math.floor(result)) {
                resultText = String.format("%.0f", result);
            } else {
                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                resultText = decimalFormat.format(result);
            }
            outputField.setText(resultText);
        }
    }

    public void calculateDivision(View view){
        String input1 = inputField1.getText().toString();
        String input2 = inputField2.getText().toString();

        boolean isEmpty = checkIfNull(input1, input2);
        if(!isEmpty) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double result = num1 / num2;

            String resultText;
            if (result == Math.floor(result)) {
                resultText = String.format("%.0f", result);
            } else {
                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                resultText = decimalFormat.format(result);
            }
            outputField.setText(resultText);
        }
    }

    public boolean checkIfNull(String inputCheck1, String inputCheck2){
        if (inputCheck1.isEmpty() || inputCheck2.isEmpty()) {
            outputField.setText("Please fill both fields");
            outputField.setTextColor(Color.RED);
            return true;
        }
        return false;
    }
}