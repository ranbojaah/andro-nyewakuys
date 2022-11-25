package com.example.nyewakuys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MobilAdapter extends ArrayAdapter<Mobil> {
    private  Context mContext;
    private int mResource;

    public MobilAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Mobil> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent, false);

        ImageView imageView = convertView.findViewById(R.id.mobil);

        TextView txtNama = convertView.findViewById(R.id.merk);

        TextView txtHarga = convertView.findViewById(R.id.harga);

        imageView.setImageResource(getItem(position).getImage());

        txtNama.setText(getItem(position).getTitle());

        txtHarga.setText(getItem(position).getHarga());

        return convertView;
    }
}
