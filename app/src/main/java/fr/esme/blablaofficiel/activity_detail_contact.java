package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_detail_contact extends AppCompatActivity {

    private Button choixdc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact);


        this.choixdc = (Button) findViewById(R.id.choixdc);
        choixdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}