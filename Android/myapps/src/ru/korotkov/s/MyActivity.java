package ru.korotkov.s;


import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void click(View v) {
        TextView text = (TextView) findViewById(v.getId());
        text.setText(Integer.toString(Integer.parseInt(text.getText().toString()) + 1));

    }
}