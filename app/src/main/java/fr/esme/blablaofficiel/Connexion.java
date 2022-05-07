package fr.esme.blablaofficiel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.google.firebase.auth.FirebaseAuth;

public class Connexion extends AppCompatActivity {

    private Button crea_compte;

    private Button login;

//    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

//        mAuth = FirebaseAuth.getInstance();

        this.crea_compte = (Button) findViewById(R.id.crea_compte);
        this.login = (Button) findViewById(R.id.login);

        crea_compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Crea_compte.class);
                startActivity(otherActivity);
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), activity_whitets.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}