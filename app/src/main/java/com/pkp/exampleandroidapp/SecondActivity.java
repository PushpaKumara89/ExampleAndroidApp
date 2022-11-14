package com.pkp.exampleandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btn;
    TextView userName, userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn = findViewById(R.id.btnSecond);
        userName = findViewById(R.id.txtUserName);
        userAge =findViewById(R.id.txtUserAge);

        Intent intent = getIntent();

//        String name = intent.getStringExtra("USER_NAME");
//        int age = intent.getIntExtra("USER_AGE", 0);

        Bundle extras = intent.getExtras();

        String name = extras.getString("USER_NAME");
        int age = extras.getInt("USER_AGE");

        userName.setText(name);
        userAge.setText(String.valueOf(age));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate to Main Activity
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}