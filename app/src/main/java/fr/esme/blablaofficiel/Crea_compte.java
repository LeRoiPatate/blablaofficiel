package fr.esme.blablaofficiel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.google.firebase.auth.FirebaseAuth;

public class Crea_compte extends AppCompatActivity {


//    private FirebaseAuth mAuth;

    private Button creecompte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_compte);

//        mAuth = FirebaseAuth.getInstance();

        this.creecompte = (Button) findViewById(R.id.creecompte);

        creecompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Connexion.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}