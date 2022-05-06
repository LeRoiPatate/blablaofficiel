package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RechercheFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recherche, container, false);
        Button confirmerr = v.findViewById(R.id.confirmerr);
        confirmerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getActivity(), Activity_trajet_dispo.class);
                startActivity(i);
            }
        });
        return v;

    }
}
