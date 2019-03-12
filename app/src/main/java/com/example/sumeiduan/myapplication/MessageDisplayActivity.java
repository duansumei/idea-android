package com.example.sumeiduan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_display);

        Intent intent = getIntent();
        String  message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView  textView = findViewById(R.id.textView);
        textView.setTextSize(40);
        textView.setText(message);
    }
}
