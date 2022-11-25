package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SsearchActivity extends AppCompatActivity {
    ImageButton home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssearch);

        home = (ImageButton) findViewById(R.id.imageButtonhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SsearchActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}