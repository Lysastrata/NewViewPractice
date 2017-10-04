package com.tries.tali.multiuseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                EditText numberEntryTextEdit = (EditText) findViewById(R.id.numberEntryTextEdit);
                double number = Integer.parseInt(numberEntryTextEdit.getText().toString());
                result += number;
                resultTextView.setText(result + "");
            }
        });
        Button subtractButton = (Button) findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                EditText numberEntryTextEdit = (EditText) findViewById(R.id.numberEntryTextEdit);
                double number = Integer.parseInt(numberEntryTextEdit.getText().toString());
                result -= number;
                resultTextView.setText(result + "");
            }
        });
        Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                EditText numberEntryTextEdit = (EditText) findViewById(R.id.numberEntryTextEdit);
                double number = Integer.parseInt(numberEntryTextEdit.getText().toString());
                result *= number;
                resultTextView.setText(result + "");
            }
        });
        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                EditText numberEntryTextEdit = (EditText) findViewById(R.id.numberEntryTextEdit);
                double number = Integer.parseInt(numberEntryTextEdit.getText().toString());
                result /= number;
                resultTextView.setText(result + "");
            }
        });
    }
}
