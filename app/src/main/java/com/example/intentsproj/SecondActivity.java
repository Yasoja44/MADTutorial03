package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static int msg1;
    public static int msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        //String message1 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE1);
        //String message2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        Bundle extras = intent.getExtras();
        String message1 = extras.getString(FirstActivity.EXTRA_MESSAGE1);
        String message2 = extras.getString(FirstActivity.EXTRA_MESSAGE2);

        msg1 = Integer.parseInt(String.valueOf(message1));
        msg2 = Integer.parseInt(String.valueOf(message2));

        TextView textView1 = findViewById(R.id.no1view2);
        TextView textView2 = findViewById(R.id.no2view2);
        textView1.setText(message1);
        textView2.setText(message2);
    }

    public void OnAddition(View view){
        TextView textView = findViewById(R.id.finalView);
        String x = msg1 + " + " + msg2 + " = ";
        int y = msg1 + msg2;
        String z = x + y;
        textView.setText(z);
    }

    public void OnSubtraction(View view){
        TextView textView = findViewById(R.id.finalView);
        String x = msg1 + " - " + msg2 + " = ";
        int y = msg1 - msg2;
        String z = x + y;
        textView.setText(z);
    }

    public void OnMultiplication(View view){
        TextView textView = findViewById(R.id.finalView);
        String x = msg1 + " * " + msg2 + " = ";
        int y = msg1 * msg2;
        String z = x + y;
        textView.setText(z);
    }

    public void OnDivision(View view){
        TextView textView = findViewById(R.id.finalView);
        String x = msg1 + " / " + msg2 + " = ";
        int y = msg1 / msg2;
        String z = x + y;
        textView.setText(z);
    }
}