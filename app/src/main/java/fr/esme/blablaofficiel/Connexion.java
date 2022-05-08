package fr.esme.blablaofficiel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Connexion extends AppCompatActivity {

    private EditText editEmail;
    private EditText editMDP;
    private Button crea_compte;

    private Button login;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        mAuth = FirebaseAuth.getInstance();

        editEmail = findViewById(R.id.username);
        editMDP = findViewById(R.id.password);
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
                loginUser();
            }
        });
    }

    private void loginUser(){
        String email = editEmail.getText().toString();
        String password = editMDP.getText().toString();

        if(TextUtils.isEmpty(email)){
            editEmail.setError("Le champ 'Email' ne peut aps être vide");
            editEmail.requestFocus();
        }
        else if(TextUtils.isEmpty(password)){
            editMDP.setError("Le champ 'Mot' de passe ne peut pas être vide");
            editMDP.requestFocus();
        }
        else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Connexion.this,"Vous êtes connecté",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), activity_whitets.class));
                        finish();
                    }
                    else{
                        Toast.makeText(Connexion.this,"Erreur de connexion : "+ task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}