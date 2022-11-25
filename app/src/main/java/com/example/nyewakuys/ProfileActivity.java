package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton back;
    TextView logut;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = (ImageButton) findViewById(R.id.imageButtonII);
        back.setOnClickListener(this);

        logut= (TextView) findViewById(R.id.textView12);
        dialog= new Dialog(this);
        logut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogoutDialog();
            }
        });
    }

    private void openLogoutDialog() {
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        Button btnYes=dialog.findViewById(R.id.yes);
        Button btnNo=dialog.findViewById(R.id.no);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent9);
           }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.imageButtonII:
                Intent intent1 = new Intent(ProfileActivity.this, HomeActivity.class);
                startActivity(intent1);
                break;
        }
    }
}