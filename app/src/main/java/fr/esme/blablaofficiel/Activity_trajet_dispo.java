package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_trajet_dispo extends AppCompatActivity {

    private TextView textView;
    private TextView textViewT;
    private TextView textViewD;
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
        textView = findViewById(R.id.TV);
        textViewT = findViewById(R.id.TVT);
        textViewD = findViewById(R.id.TVD);

        Intent intent = getIntent();
        String s = intent.getStringExtra("key");
        textView.setText(s);

        Intent intentT = getIntent();
        String t = intentT.getStringExtra("keyt");
        textViewT.setText(t);

        Intent intentD = getIntent();
        String d = intentD.getStringExtra("keyd");
        textViewD.setText(d);
    }
}