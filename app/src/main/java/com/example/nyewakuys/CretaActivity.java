package com.example.nyewakuys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CretaActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home, back;
    Button pesan;
    ImageButton prof, menu;
    Dialog dialog;
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

        menu = (ImageButton) findViewById(R.id.menu2);
        dialog = new Dialog(this);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuDialog();
            }
        });
    }

    private void menuDialog() {
        dialog.setContentView(R.layout.menu);
        dialog.show();
        Window window = dialog.getWindow();
        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.gravity = Gravity.LEFT;
        wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setAttributes(wlp);
        ImageButton back=dialog.findViewById(R.id.imageButtonback);
        TextView home=dialog.findViewById(R.id.textView68);
        TextView history=dialog.findViewById(R.id.textView70);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CretaActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CretaActivity.this, SsearchActivity.class);
                startActivity(intent);
            }
        });
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