package com.a2k18.hightech.unisex_mobile.model;

import android.graphics.Bitmap;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by jetro on 2/10/18.
 */

public class Service {

    private String nom;
    private double prix;
    public Bitmap image;


    public Service(){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }


}
