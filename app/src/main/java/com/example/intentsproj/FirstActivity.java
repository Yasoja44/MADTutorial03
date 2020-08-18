package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 =
            "com.example.myfirstapp.MESSAGE1";

    public static final String EXTRA_MESSAGE2 =
            "com.example.myfirstapp.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendMessage(View view) {
        Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        Intent intent = new Intent(this, SecondActivity.class);
        EditText edText1 = (EditText)findViewById(R.id.no1view);
        EditText edText2 = (EditText)findViewById(R.id.no2view);
        String message1 = edText1.getText().toString();
        String message2 = edText2.getText().toString();

        Bundle extras = new Bundle();
        extras.putString(EXTRA_MESSAGE1,message1);
        extras.putString(EXTRA_MESSAGE2,message2);
        intent.putExtras(extras);

        startActivity(intent);
    }
}