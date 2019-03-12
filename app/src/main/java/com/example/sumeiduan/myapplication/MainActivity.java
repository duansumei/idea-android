package com.example.sumeiduan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public  final static  String  EXTRA_MESSAGE = "com.duansumei.MESSAGE";

    public  void  sendMessage(View view) {
        EditText editText = findViewById(R.id.edit_message);
        String  displayMsg = editText.getText().toString();

        Intent intent = new Intent(this, MessageDisplayActivity.class);
        intent.putExtra(EXTRA_MESSAGE, displayMsg);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
