package com.a2k18.hightech.unisex_mobile.Activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.a2k18.hightech.unisex_mobile.MainActivity;
import com.a2k18.hightech.unisex_mobile.R;
import com.a2k18.hightech.unisex_mobile.dialog.DialogPaiement;

public class DemandeActivity extends AppCompatActivity {

    private Button next;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demande);

        next = (Button) findViewById(R.id.btNext);
        sp = (Spinner) findViewById(R.id.spService);

        getSupportActionBar().setTitle("Demande Service");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String reqServ = (String) getIntent().getStringExtra("nomService");

        /*if(reqServ.equals("Lavage Simple") || reqServ.equals("Allonge") || reqServ.equals("Manicure")){
            sp.setVisibility(View.GONE);
        }*/

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                DialogPaiement alertDialog = DialogPaiement.newInstance("Paiement");
                alertDialog.show(fm, "fragment_alert");

            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // do something useful
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                overridePendingTransition(17432578, 17432579);
                finish();
        }

        return(super.onOptionsItemSelected(item));
    }
}
