package com.example.josh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        //Create an intent to launch the DisplayMessageActivity activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        //Get the text box on the MainActivity activity to forward its text
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        //Add the text from to the intent and fire the intent
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}