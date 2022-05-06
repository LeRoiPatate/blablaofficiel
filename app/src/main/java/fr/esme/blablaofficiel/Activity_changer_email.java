package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_changer_email extends AppCompatActivity {

    private Button confirmermail;
    private Button choixce;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changer_email);


        this.choixce = (Button) findViewById(R.id.choixce);
        choixce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });


        this.confirmermail = (Button) findViewById(R.id.confirmermail);
        confirmermail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Activity_confirmation_email.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}