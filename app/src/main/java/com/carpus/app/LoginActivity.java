package com.carpus.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    ImageButton eBackFromLoginBtn;
    TextView eLoginPageEmailTxt;
    TextView eLoginPagePasswordTxt;
    Button eLoginPageLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        eBackFromLoginBtn = findViewById(R.id.backFromLoginButton);
        eLoginPageEmailTxt = findViewById(R.id.signupPageEmailText);
        eLoginPagePasswordTxt = findViewById(R.id.signupPagePasswordText);
        eLoginPageLoginBtn = findViewById(R.id.loginPageLoginButton);

        eBackFromLoginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        eLoginPageLoginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}