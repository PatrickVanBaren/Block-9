package com.example.unittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView resultText;

    private final SimpleCalculator mSimpleCalculator = new SimpleCalculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.first_number_view);
        secondNumber = findViewById(R.id.second_number_view);
        resultText = findViewById(R.id.result_view);
    }

    public void onSumButton(View view) {
        resultText.setText(String.format("Result: %d", mSimpleCalculator.sum(getFirstNumber(), getSecondNumber())));
    }

    public void onDiffButton(View view) {
        resultText.setText(String.format("Result: %d", mSimpleCalculator.diff(getFirstNumber(), getSecondNumber())));
    }

    public void onMultiplyButton(View view) {
        resultText.setText(String.format("Result: %d", mSimpleCalculator.multiply(getFirstNumber(), getSecondNumber())));
    }

    public void onDivButton(View view) {
        resultText.setText(String.format("Result: %d", mSimpleCalculator.div(getFirstNumber(), getSecondNumber())));
    }

    private int getFirstNumber() {
        return Integer.valueOf(firstNumber.getText().toString());
    }

    private int getSecondNumber() {
        return Integer.valueOf(secondNumber.getText().toString());
    }
}
