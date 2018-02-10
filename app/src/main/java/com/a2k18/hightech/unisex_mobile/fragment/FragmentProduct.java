package com.a2k18.hightech.unisex_mobile.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a2k18.hightech.unisex_mobile.R;

/**
 * Created by jetro on 2/10/18.
 */

public class FragmentProduct extends Fragment {


    public FragmentProduct() {
        // Required empty public constructor
    }

    public static FragmentProduct newInstance(String title) {
        FragmentProduct fragProduct = new FragmentProduct();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragProduct.setArguments(args);

        return fragProduct;
    }


    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_product, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }
}
