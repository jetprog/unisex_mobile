package com.a2k18.hightech.unisex_mobile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.a2k18.hightech.unisex_mobile.R;
import com.a2k18.hightech.unisex_mobile.model.Service;

import java.util.ArrayList;

/**
 * Created by jetro on 2/10/18.
 */

public class ArrayAdapterServices extends ArrayAdapter<Service> {

    //constructor
    public ArrayAdapterServices(Context context, ArrayList<Service> tchalaList)
    {
        super(context, android.R.layout.simple_list_item_1, tchalaList);
    }

    //custom view to populate data
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Service serv = getItem(position);
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_services, parent, false);
        }

        //Find views

        TextView nom = (TextView) convertView.findViewById(R.id.tvTitleService);
        TextView lot = (TextView) convertView.findViewById(R.id.tvDetailsServ);

        //populate data
        nom.setText(serv.getNom());
        lot.setText(String.valueOf(serv.getPrix()) + "gdes");

        return convertView;
    }

}
