package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class ReglagesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_reglages, container, false);
        Button modifmdp = v.findViewById(R.id.modifmdp);
        modifmdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), Activity_confirmer_mdp.class);
                startActivity(i);
            }
        });

        Button modifmail = v.findViewById(R.id.modifmail);
        modifmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), Activity_changer_email.class);
                startActivity(i);
            }
        });

        return v;


    }
}