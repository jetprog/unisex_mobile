package com.a2k18.hightech.unisex_mobile.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.a2k18.hightech.unisex_mobile.Activity.DemandeActivity;
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


    private GridView gvServ;
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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Liste services");

        listserv = Values.listService();
        gvServ = (GridView) v.findViewById(R.id.gvResults);
        adapter = new ArrayAdapterServices(getContext(), listserv);
        gvServ.setAdapter(adapter);

        onClickGrid();

        return v;
    }

    public void onClickGrid(){
        gvServ.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Service serv = listserv.get(i);

                Intent newInt = new Intent(getActivity(), DemandeActivity.class);
                newInt.putExtra("nomService", serv.getNom().toString());
                startActivity(newInt);
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
