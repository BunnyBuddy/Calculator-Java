package com.example.calculatorappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
    }

    public void button1Click(View view) {
        int currentText = Integer.parseInt((String) tvResult.getText());
        if(currentText == 0){
            tvResult.setText("1");
        } else {
            tvResult.setText(String.valueOf(currentText) + "1");
        }
    }
}