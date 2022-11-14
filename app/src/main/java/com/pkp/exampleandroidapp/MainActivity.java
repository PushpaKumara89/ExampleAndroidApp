package com.pkp.exampleandroidapp;

import android.content.Intent;
import android.net.Uri;
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

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"pradeep@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"This is our test Subject");
        intent.putExtra(Intent.EXTRA_TEXT,"This is our test email body");
        intent.setType("massage/rfc88");
        Intent chooser = Intent.createChooser(intent, "Send email text app");


        //set listener to the button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(chooser);
            }
        });
    }
}