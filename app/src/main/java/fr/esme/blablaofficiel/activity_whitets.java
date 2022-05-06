package fr.esme.blablaofficiel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_whitets extends AppCompatActivity {

    Button btn_white;
    private Button btnRecherche;
    private Button btnTableauDeBord;
    private Button btnPublier;
    private Button btnContact;
    private Button btnReglages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whitets);


        btnRecherche = findViewById(R.id.btnRecherche);
        btnRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new RechercheFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerwhite,fragment).commit();
            }
        });

        btnTableauDeBord = findViewById(R.id.btnTableauDeBord);
        btnTableauDeBord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new TableauDeBordFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerwhite,fragment).commit();
            }
        });

        btnPublier = findViewById(R.id.btnPublier);
        btnPublier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new PublierFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerwhite,fragment).commit();
            }
        });

        btnContact = findViewById(R.id.btnContact);
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new ContactFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerwhite,fragment).commit();
            }
        });

        btnReglages = findViewById(R.id.btnReglages);
        btnReglages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new ReglagesFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerwhite,fragment).commit();
            }
        });

    }
}