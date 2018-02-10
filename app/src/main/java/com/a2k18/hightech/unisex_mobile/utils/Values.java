package com.a2k18.hightech.unisex_mobile.utils;

import com.a2k18.hightech.unisex_mobile.model.Produit;
import com.a2k18.hightech.unisex_mobile.model.Service;

import java.util.ArrayList;

/**
 * Created by jetro on 2/10/18.
 */

public class Values {

    public static ArrayList<Service> listService(){
        ArrayList<Service> listServ = new ArrayList<>();

        Service serv1 = new Service();
        serv1.setNom("Application défrisant");
        serv1.setPrix(500);
        listServ.add(serv1);

        Service serv2 = new Service();
        serv2.setNom("Lavage");
        serv2.setPrix(350);
        listServ.add(serv2);

        Service serv3 = new Service();
        serv3.setNom("Blow");
        serv3.setPrix(350);
        listServ.add(serv3);

        Service serv4 = new Service();
        serv4.setNom("Bain d'huile");
        serv4.setPrix(600);
        listServ.add(serv4);

        Service serv5 = new Service();
        serv5.setNom("Bain de crème");
        serv5.setPrix(600);
        listServ.add(serv5);

        Service serv6 = new Service();
        serv6.setNom("Décoloration");
        serv6.setPrix(750);
        listServ.add(serv6);

        Service serv7 = new Service();
        serv7.setNom("Extension Cheveux");
        serv7.setPrix(1250);
        listServ.add(serv7);

        Service serv8 = new Service();
        serv8.setNom("Allonge");
        serv8.setPrix(750);
        listServ.add(serv8);

        Service serv9 = new Service();
        serv9.setNom("Manicure");
        serv9.setPrix(250);
        listServ.add(serv9);

        Service serv10 = new Service();
        serv10.setNom("Pédicure");
        serv10.setPrix(250);
        listServ.add(serv10);

        Service serv11 = new Service();
        serv11.setNom("Acrilique");
        serv11.setPrix(350);
        listServ.add(serv11);


        return listServ;
    }


    public static ArrayList<Produit> listProduit(){
        ArrayList<Produit> listProd = new ArrayList<>();




        return listProd;
    }
}
