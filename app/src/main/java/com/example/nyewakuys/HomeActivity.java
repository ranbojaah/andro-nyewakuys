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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import kotlin.jvm.internal.Ref;

public class HomeActivity extends AppCompatActivity {
    ListView listView;
    ArrayList <String> list = new ArrayList<String>();
    ImageButton prof, menu;
    ImageView search;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<Mobil> arrayList = new ArrayList<>();

        arrayList.add(new Mobil(R.drawable.hrv, "Honda HR-V 2022", "RP 500.000"));
        arrayList.add(new Mobil(R.drawable.creta, "Hyundai Creta", "RP 700.000"));
        arrayList.add(new Mobil(R.drawable.civic, "Civic Turbo 2022", "RP 750.000"));
        arrayList.add(new Mobil(R.drawable.pajero, "Pajero 2021", "RP 800.000"));
        arrayList.add(new Mobil(R.drawable.range_rover, "Range Rover", "RP 1.500.000"));

        MobilAdapter mobilAdapter = new MobilAdapter(this,R.layout.list,arrayList);

        listView.setAdapter(mobilAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    startActivity(new Intent(HomeActivity.this, HRVActivity.class));
                } else if(i == 1){
                    startActivity(new Intent(HomeActivity.this, CretaActivity.class));
                } else if (i == 2){
                    startActivity(new Intent(HomeActivity.this, CivicActivity.class));
                } else if (i == 3){
                    startActivity(new Intent(HomeActivity.this, PajeroActivity.class));
                }else if (i == 4){
                    startActivity(new Intent(HomeActivity.this, RroverActivity.class));
                }
            }
        });
        prof = (ImageButton) findViewById(R.id.imageButton4);
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent1);
            }
        });
        search = (ImageView) findViewById(R.id.imageView2);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(HomeActivity.this, SsearchActivity.class);
                startActivity(intent2);
            }
        });
        menu = (ImageButton) findViewById(R.id.imagemenu);
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
                dialog.dismiss();
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SsearchActivity.class);
                startActivity(intent);
            }
        });
    }
}