package com.carpus.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    ImageButton eBackFromAboutUsBtn;
    TextView eAboutUsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        eBackFromAboutUsBtn = findViewById(R.id.backFromAboutUsButton);
        eAboutUsTxt = findViewById(R.id.aboutUsText);

        eBackFromAboutUsBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}