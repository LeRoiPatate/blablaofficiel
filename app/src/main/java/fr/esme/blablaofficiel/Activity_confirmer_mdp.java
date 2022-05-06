package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_confirmer_mdp extends AppCompatActivity {

    private Button confirmermdp;
    private Button choixcm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmer_mdp);


        this.choixcm = (Button) findViewById(R.id.choixcm);
        choixcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });


        this.confirmermdp = (Button) findViewById(R.id.confirmermdp);
        confirmermdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}