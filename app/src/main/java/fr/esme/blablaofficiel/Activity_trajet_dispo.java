package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_trajet_dispo extends AppCompatActivity {

    private Button recapi_trajet;
    private Button choixtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trajet_dispo);


        this.choixtd = (Button) findViewById(R.id.choixtd);
        choixtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });


        this.recapi_trajet = (Button) findViewById(R.id.recapi_trajet);
        recapi_trajet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), trajetselect.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}