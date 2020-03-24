package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String takeExtra1;
    String takeExtra2;
    String n1;
    String n2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button addBtn = (Button) findViewById(R.id.addButton);
        Button subBtn = (Button) findViewById(R.id.subsButton);
        Button multiBtn = (Button) findViewById(R.id.multiButton);
        Button divideBtn = (Button) findViewById(R.id.devideButon);

        final TextView resultView = (TextView) findViewById(R.id.result);

        Intent getIntent = getIntent();

        EditText num01 = (EditText) findViewById(R.id.number1);
        EditText num02 = (EditText) findViewById(R.id.number2);

        takeExtra1 = getIntent.getStringExtra("EXTRA1");
        takeExtra2 = getIntent.getStringExtra("EXTRA2");

        num01.setText(takeExtra1);
        num02.setText(takeExtra2);

        n1 = num01.getText().toString();
        n2 = num02.getText().toString();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(takeExtra1)+ Double.parseDouble(takeExtra2);
                resultView.setText(Double.toString(result));
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(takeExtra1) - Double.parseDouble(takeExtra2);
                resultView.setText(Double.toString(result));
            }
        });

        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(takeExtra1) * Double.parseDouble(takeExtra2);
                resultView.setText(Double.toString(result));
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(takeExtra1) / Double.parseDouble(takeExtra2);
                resultView.setText(Double.toString(result));
            }
        });
    }
}
