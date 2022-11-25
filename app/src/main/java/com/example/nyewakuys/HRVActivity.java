package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HRVActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home;
    TextView back;
    Button pesan;
    ImageButton prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrvactivity);
        home = (TextView) findViewById(R.id.textView13);
        home.setOnClickListener(this);
        back = (TextView) findViewById(R.id.textView15);
        back.setOnClickListener(this);
        pesan = (Button) findViewById(R.id.button3);
        pesan.setOnClickListener(this);
        prof = (ImageButton) findViewById(R.id.imageButton3);
        prof.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.textView13:
                Intent intent1 = new Intent(HRVActivity.this, HomeActivity.class);
                startActivity(intent1);
                break;
            case R.id.textView15:
                Intent intent2 = new Intent(HRVActivity.this, HomeActivity.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Toast.makeText(this, "Kamu Memesan Honda HR-V 2022", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton3:
                Intent intent3 = new Intent(HRVActivity.this, ProfileActivity.class);
                startActivity(intent3);
                break;
        }
    }
}