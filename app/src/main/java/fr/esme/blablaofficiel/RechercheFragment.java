package fr.esme.blablaofficiel;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class RechercheFragment extends Fragment {

    EditText editText;
    EditText editTextT;
    EditText editTextD;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recherche, container, false);
        Button confirmerr = v.findViewById(R.id.confirmerr);
        editText = v.findViewById(R.id.editDepart);
        editTextT = v.findViewById(R.id.editDestination);
        editTextD = v.findViewById(R.id.editDate);
        confirmerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent= new Intent(getActivity(), Activity_trajet_dispo.class);
                intent.putExtra("key",editText.getText().toString());
                intent.putExtra("keyt",editTextT.getText().toString());
                intent.putExtra("keyd",editTextD.getText().toString());
                startActivity(intent);

            }
        });
        return v;

    }
}
