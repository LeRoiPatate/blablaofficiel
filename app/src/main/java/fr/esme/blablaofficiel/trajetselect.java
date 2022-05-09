package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class trajetselect extends AppCompatActivity implements View.OnClickListener {

    private Button btnMaps;
    private Button confirmerts;
    private Button joindre;
    private Button choixts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trajetselect);

        this.joindre = (Button) findViewById(R.id.joindre);
        joindre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_detail_contact.class);
                startActivity(otherActivity);
                finish();
            }
        });

        this.confirmerts = (Button) findViewById(R.id.confirmerts);
        confirmerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });

        this.choixts = (Button) findViewById(R.id.choixts);
        choixts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });


        this.btnMaps = (Button) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), MapsActivity2.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}