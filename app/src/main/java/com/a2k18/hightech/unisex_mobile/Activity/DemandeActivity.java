package com.a2k18.hightech.unisex_mobile.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.a2k18.hightech.unisex_mobile.R;
import com.a2k18.hightech.unisex_mobile.dialog.DialogPaiement;

public class DemandeActivity extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demande);

        next = (Button) findViewById(R.id.btNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                DialogPaiement alertDialog = DialogPaiement.newInstance("Paiement");
                alertDialog.show(fm, "fragment_alert");

            }
        });

    }
}
