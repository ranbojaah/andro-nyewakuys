package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class RroverActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home, back;
    Button pesan;
    ImageButton prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rrover);

        home = (TextView) findViewById(R.id.textView57);
        home.setOnClickListener(this);
        back = (TextView) findViewById(R.id.textView59);
        back.setOnClickListener(this);
        pesan = (Button) findViewById(R.id.button8);
        pesan.setOnClickListener(this);
        prof = (ImageButton) findViewById(R.id.imageButton12);
        prof.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.textView57:
                Intent intent1 = new Intent(RroverActivity.this, HomeActivity.class);
                startActivity(intent1);
                break;
            case R.id.textView59:
                Intent intent2 = new Intent(RroverActivity.this, HomeActivity.class);
                startActivity(intent2);
                break;
            case R.id.button8:
                Toast.makeText(this, "Kamu Memesan Range Rover", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton12:
                Intent intent3 = new Intent(RroverActivity.this, ProfileActivity.class);
                startActivity(intent3);
                break;
        }
    }
}