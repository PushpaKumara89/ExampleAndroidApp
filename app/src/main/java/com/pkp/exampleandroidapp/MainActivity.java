package com.pkp.exampleandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnMain);
        //create intent Object
        final Intent intent = new Intent(this, SecondActivity.class);

        String name = "Pushpa Kumara";
        int age = 33;

        //set data value to intent
        intent.putExtra("USER_NAME", name);
        intent.putExtra("USER_AGE",age);

        //set listener to the button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate second Activity
                startActivity(intent);
            }
        });
    }
}