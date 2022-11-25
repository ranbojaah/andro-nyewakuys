package com.example.nyewakuys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainRegister extends AppCompatActivity implements View.OnClickListener{
    TextView Login;
    Button Regis;
    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main_register);
        Login = (TextView) findViewById(R.id.textView9);
        Login.setOnClickListener(this);
        Regis = (Button) findViewById(R.id.button2);
        Regis.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.textView9:
                Intent intent3 = new Intent(MainRegister.this, MainActivity.class);
                startActivity(intent3);
                break;
            case R.id.button2:
                Intent intent4 = new Intent(MainRegister.this, HomeActivity.class);
                startActivity(intent4);
                break;
        }
    }
}