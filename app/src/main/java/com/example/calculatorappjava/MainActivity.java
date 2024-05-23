package com.example.calculatorappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
    }

    public void digitButtonClick(View view) {
        int currentText = Integer.parseInt((String) tvResult.getText());
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        if (currentText == 0) {
            tvResult.setText(buttonText);
        } else {
            tvResult.setText(currentText + buttonText);
        }
    }

    public void operatorButtonClick(View view) {
        int currentText = Integer.parseInt((String) tvResult.getText());
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        if(currentText != 0){
            switch (buttonText) {
                case "+":
                    tvResult.setText(currentText + buttonText);
                    break;
                case "-":
                    tvResult.setText(currentText + buttonText);
                    break;
                case "/":
                    tvResult.setText(currentText + buttonText);
                    break;
                case "=":
                    break;
            }
        }
    }
}