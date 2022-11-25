package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Register;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Register = (TextView) findViewById(R.id.textView5);
        Register.setOnClickListener(this);
        Login = (Button) findViewById(R.id.button);
        Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView5:
                Intent intent = new Intent(MainActivity.this, MainRegister.class);
                startActivity(intent);
                break;
            case R.id.button:
                Intent intent2 = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent2);
                break;
        }
    }
}