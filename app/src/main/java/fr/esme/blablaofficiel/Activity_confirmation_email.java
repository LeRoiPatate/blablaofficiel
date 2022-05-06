package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_confirmation_email extends AppCompatActivity {

    private Button confirmer3;
    private Button choixco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_email);


        this.choixco = (Button) findViewById(R.id.choixco);
        choixco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });


        this.confirmer3 = (Button) findViewById(R.id.confirmer3);
        confirmer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}