package com.a2k18.hightech.unisex_mobile.fragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.a2k18.hightech.unisex_mobile.Activity.DemandeActivity;
import com.a2k18.hightech.unisex_mobile.R;

/**
 * Created by jetro on 2/10/18.
 */

public class MainFragment extends Fragment {

    private ImageButton services;
    private ImageButton product;
    private ImageButton request;

    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance(String title) {
        MainFragment fragMain = new MainFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragMain.setArguments(args);

        return fragMain;
    }


    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        View v = inflater.inflate(R.layout.main_fragment, parent, false);

        services = (ImageButton) v.findViewById(R.id.imBListServices);
        product = (ImageButton) v.findViewById(R.id.imBSalesProduct);
        request = (ImageButton) v.findViewById(R.id.imBRequestServices);

        onServices();
        onProduct();
        onRequest();

        return v;
    }


    public void onServices(){
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = FragmentServicesLists.newInstance("Liste Services");
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_Main_Content, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    public void onProduct(){
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = FragmentProduct.newInstance("Liste Services");
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_Main_Content, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
    }

    public void onRequest(){
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), DemandeActivity.class);
                startActivity(i);
            }
        });
    }


    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }


}

