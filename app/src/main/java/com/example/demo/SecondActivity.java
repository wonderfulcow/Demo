package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText txt_UserName;
    private Button btn_ClickMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt_UserName = (EditText) findViewById(R.id.txt_UserName);
        btn_ClickMe = (Button) findViewById(R.id.btn_change);

        txt_UserName.getText();

        btn_ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,txt_UserName.getText().toString(),15).show();
            }
        });

    }
}