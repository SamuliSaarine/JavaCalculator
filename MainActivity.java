package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText first;
    private EditText second;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.firsNumber);
        second = findViewById(R.id.secondNumber);
        result = findViewById(R.id.result);
    }

    public void add(View view)
    {
        Integer r = Integer.parseInt(first.getText().toString())+Integer.parseInt(second.getText().toString());
        result.setText(r.toString());
    }

    public void minus(View view)
    {
        Integer r = Integer.parseInt(first.getText().toString())-Integer.parseInt(second.getText().toString());
        result.setText(r.toString());
    }

    public void multiply(View view)
    {
        Integer r = Integer.parseInt(first.getText().toString())*Integer.parseInt(second.getText().toString());
        result.setText(r.toString());
    }

    public void divide(View view)
    {
        Integer r = Integer.parseInt(first.getText().toString())/Integer.parseInt(second.getText().toString());
        result.setText(r.toString());
    }
}