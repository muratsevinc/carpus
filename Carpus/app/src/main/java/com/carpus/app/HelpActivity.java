package com.carpus.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    ImageButton eBackFromHelpBtn;
    TextView eInfoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        eBackFromHelpBtn = findViewById(R.id.backFromHelpButton);
        eInfoTxt = findViewById(R.id.aboutUsText);

        eBackFromHelpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}