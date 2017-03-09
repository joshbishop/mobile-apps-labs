package com.example.josh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //get the intent used to launch the activity
        Intent intent = getIntent();
        //get the message from the intent, or null if no message
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //create and format a new text box
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        //fill out the text box with the message
        textView.setText(message);
        //get the activity view and add the text box to it
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
