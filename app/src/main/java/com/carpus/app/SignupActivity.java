package com.carpus.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    ImageButton eBackFromSignupBtn;
    TextView eSignupPageNameTxt;
    TextView eSignupPageIdTxt;
    TextView eSignupPageEmailTxt;
    TextView eSignupPagePasswordTxt;
    Button eSignupPageSignupBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        eBackFromSignupBtn = findViewById(R.id.backFromSignupButton);
        eSignupPageNameTxt = findViewById(R.id.signupPageNameText);
        eSignupPageIdTxt = findViewById(R.id.signupPageIdText);
        eSignupPageEmailTxt = findViewById(R.id.signupPageEmailText);
        eSignupPagePasswordTxt = findViewById(R.id.signupPagePasswordText);
        eSignupPageSignupBtn = findViewById(R.id.signupPageSignupButton);

        eBackFromSignupBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        eSignupPageSignupBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}