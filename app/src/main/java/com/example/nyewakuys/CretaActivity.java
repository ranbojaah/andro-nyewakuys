package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CretaActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home, back;
    Button pesan;
    ImageButton prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creta);
        home = (TextView) findViewById(R.id.textView36);
        home.setOnClickListener(this);
        back = (TextView) findViewById(R.id.textView38);
        back.setOnClickListener(this);
        pesan = (Button) findViewById(R.id.button5);
        pesan.setOnClickListener(this);
        prof = (ImageButton) findViewById(R.id.imageButton6);
        prof.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.textView36:
                Intent intent1 = new Intent(CretaActivity.this, HomeActivity.class);
                startActivity(intent1);
                break;
            case R.id.textView38:
                Intent intent2 = new Intent(CretaActivity.this, HomeActivity.class);
                startActivity(intent2);
                break;
            case R.id.button5:
                Toast.makeText(this, "Kamu Memesan Hyundai Creta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton6:
                Intent intent3 = new Intent(CretaActivity.this, ProfileActivity.class);
                startActivity(intent3);
                break;
        }
    }
}