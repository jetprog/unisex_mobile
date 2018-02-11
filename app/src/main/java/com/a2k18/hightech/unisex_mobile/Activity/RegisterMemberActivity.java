package com.a2k18.hightech.unisex_mobile.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.a2k18.hightech.unisex_mobile.MainActivity;
import com.a2k18.hightech.unisex_mobile.R;

public class RegisterMemberActivity extends AppCompatActivity {

    private Button member;
    private EditText nom;
    private Spinner sexe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_member);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Agent UniMobile");

        member = (Button) findViewById(R.id.btRegister);
        nom = (EditText) findViewById(R.id.edtNomComplet);
        sexe = (Spinner) findViewById(R.id.spSexe);



        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = "Bienvenue à UniMobile nous vous appellerons sous peu pour une interview";;
                String title;

                if(sexe.getSelectedItem().equals("M")){
                    title = "Mr "+ nom.getText().toString();
                }
                else{
                    title = "Mme " + nom.getText().toString();
                }

                alerteMessage(title, message);

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



    private void alerteMessage(String title,String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle(title)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                        dialoginterface.cancel();
                    }
                }).show();

        member.setClickable(false);
    }
}
