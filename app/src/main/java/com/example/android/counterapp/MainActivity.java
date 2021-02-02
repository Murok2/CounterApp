package com.example.android.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.String.format;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countButton(View v) {
        count = count + 1;
        displayForCount(String.format("%04d", count));;
    }

    public void resetButton(View v) {
        displayForCount(String.format("0000"));
        count = 0;
    }
    public void displayForCount(String score) {
        TextView scoreView = (TextView) findViewById(R.id.text_view);
        scoreView.setText(String.valueOf(score));
    }
}