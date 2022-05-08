package fr.esme.blablaofficiel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


public class Crea_compte extends AppCompatActivity {


    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    private EditText editEmail;
    private EditText editMDP;
    private EditText editNom;
    private EditText editPrenom;
    private EditText editTelephone;

    private Button creecompte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_compte);

        editEmail=findViewById(R.id.editEmail);
        editMDP=findViewById(R.id.editMDP);
        editNom=findViewById(R.id.editNom);
        editPrenom=findViewById(R.id.editPrenom);
        editTelephone=findViewById(R.id.editTelephone);

        this.creecompte = (Button) findViewById(R.id.creecompte);


        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        creecompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });
    }

    private void createUser(){
        String email = editEmail.getText().toString();
        String password = editMDP.getText().toString();

        if(TextUtils.isEmpty(email)){
            editEmail.setError("Le champ 'Email' ne peut aps être vide");
            editEmail.requestFocus();
        }
        else if(TextUtils.isEmpty(password)){
            editMDP.setError("Le champ 'Mot de passe ne peut pas être vide");
            editMDP.requestFocus();
        }
        else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        addDataToFirestore(email);

                        ProfileUser();
                    }
                    else{
                        Toast.makeText(Crea_compte.this,"Erreur de l'enregistrement utilisateur : "+ task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(getApplicationContext(), activity_whitets.class));
        finish();
    }

    public void addDataToFirestore(String email){

        CollectionReference dbUser = db.collection("Users");

        FirebaseUser user = mAuth.getCurrentUser();
        String uid = user.getUid();
        // adding our data to our users object class.
        Utilisateur userModel = new Utilisateur(uid,email);

        // below method is use to add data to Firebase Firestore.
        dbUser.document(uid).set(userModel).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // after the data addition is successful
                // we are displaying a success toast message.
                Log.d("createUser Success", "L'utilisateur "+uid+" a bien été enregistré");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("createUser Fail", "Erreur dans l'ajout de l'utilisateur", e);
            }
        });
    }

    private void ProfileUser(){
        String nom = editNom.getText().toString();
        String prenom = editPrenom.getText().toString();
        String tel = editTelephone.getText().toString();

        FirebaseUser user = mAuth.getCurrentUser();
        String uid = user.getUid();

        if(TextUtils.isEmpty(prenom)){
            editPrenom.setError("Le champ 'Prénom' ne peut pas être vide");
            editPrenom.requestFocus();
        }
        else if(TextUtils.isEmpty(nom)){
            editNom.setError("LenomEditText champ 'Nom' ne peut pas être vide");
            editNom.requestFocus();
        }
        else if(TextUtils.isEmpty(tel)){
            editTelephone.setError("Le champ 'Numéro de téléphone' ne peut pas être vide");
            editTelephone.requestFocus();
        }
        else{
            DocumentReference docRef = db.collection("Users").document(uid);

            docRef
                    .update("prenom", prenom,"nom",nom,"numtel",tel)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d("updateUserDoc Success", "DocumentSnapshot successfully updated!");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("updateUserDoc Success", "Error updating document");
                        }
                    });
            startActivity(new Intent(getApplicationContext(), Connexion.class));
            finish();
        }
    }
}