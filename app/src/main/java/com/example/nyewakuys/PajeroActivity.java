package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.Validator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PajeroActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home, back;
    Button pesan;
    ImageButton prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajero);

        home = (TextView) findViewById(R.id.textViewA);
        home.setOnClickListener(this);
        back = (TextView) findViewById(R.id.textViewC);
        back.setOnClickListener(this);
        pesan = (Button) findViewById(R.id.buttonE);
        pesan.setOnClickListener(this);
        prof =(ImageButton) findViewById(R.id.imageButtonB);
        prof.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.textViewA:
                Intent intent1 = new Intent(PajeroActivity.this, HomeActivity.class);
                startActivity(intent1);
                break;
            case R.id.textViewC:
                Intent intent2 = new Intent(PajeroActivity.this, HomeActivity.class);
                startActivity(intent2);
                break;
            case R.id.buttonE:
                Toast.makeText(this, "Kamu Memesan Pajero 2021", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonB:
                Intent intent3 = new Intent(PajeroActivity.this, ProfileActivity.class);
                startActivity(intent3);
                break;
        }
    }
}