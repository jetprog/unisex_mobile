package com.a2k18.hightech.unisex_mobile.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.a2k18.hightech.unisex_mobile.R;
import com.a2k18.hightech.unisex_mobile.adapter.ArrayAdapterServices;
import com.a2k18.hightech.unisex_mobile.model.Service;
import com.a2k18.hightech.unisex_mobile.utils.Values;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jetro on 2/10/18.
 */

public class FragmentServicesLists extends Fragment {


    private ListView lvserv;
    private ArrayList<Service> listserv;
    private ArrayAdapterServices adapter;

    public FragmentServicesLists() {
        // Required empty public constructor
    }

    public static FragmentServicesLists newInstance(String title) {
        FragmentServicesLists fragServices = new FragmentServicesLists();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragServices.setArguments(args);

        return fragServices;
    }


    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        View v = inflater.inflate(R.layout.fragment_services, parent, false);


        listserv = Values.listService();
        lvserv = (ListView) v.findViewById(R.id.lvServices);
        adapter = new ArrayAdapterServices(getContext(), listserv);
        lvserv.setAdapter(adapter);

        return v;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }
}
