package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CivicActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home, back;
    Button pesan;
    ImageButton prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civic);

        home = (TextView) findViewById(R.id.textView47);
        home.setOnClickListener(this);
        back = (TextView) findViewById(R.id.textView49);
        back.setOnClickListener(this);
        pesan = (Button) findViewById(R.id.button6);
        pesan.setOnClickListener(this);
        prof = (ImageButton) findViewById(R.id.imageButton8);
        prof.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.textView47:
                Intent intent1 = new Intent(CivicActivity.this, HomeActivity.class);
                startActivity(intent1);
                break;
            case R.id.textView49:
                Intent intent2 = new Intent(CivicActivity.this, HomeActivity.class);
                startActivity(intent2);
                break;
            case R.id.button6:
                Toast.makeText(this, "Kamu Memesan Civic Turbo 2022", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton8:
                Intent intent3 = new Intent(CivicActivity.this, ProfileActivity.class);
                startActivity(intent3);
                break;
        }
    }
}