package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class ReglagesFragment extends Fragment {

    FirebaseFirestore db;
    FirebaseAuth mAuth;

    private EditText nom,prenom,numtel,modifmail;
    private Button confmodif,deconnexion;
    private boolean nomBool, prenomBool, emailBool;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_reglages, container, false);

        mAuth = FirebaseAuth.getInstance();


        // Deconnexion
        this.deconnexion = v.findViewById(R.id.deconnexion);
        deconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i= new Intent(getActivity(), Connexion.class);
                startActivity(i);
            }
        });

        return v;


    }
}