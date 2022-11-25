package com.example.nyewakuys;

public class Mobil {
    int Image;
    String Title, Harga;

    public Mobil(int image, String title, String harga){
        Image = image;
        Title = title;
        Harga = harga;
    }
    public int getImage(){return  Image;}

    public void setImage(int image) {
        Image = image;
    }
    public  String getTitle(){return Title;}

    public void setTitle(String title) {
        Title = title;
    }
    public String getHarga(){return Harga;}

    public void setHarga(String harga) {
        Harga = harga;
    }
}
