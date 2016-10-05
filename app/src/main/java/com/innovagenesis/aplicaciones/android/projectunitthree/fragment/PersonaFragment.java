package com.innovagenesis.aplicaciones.android.projectunitthree.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;
import com.innovagenesis.aplicaciones.android.projectunitthree.container.PersonaSerializable;
import com.innovagenesis.aplicaciones.android.projectunitthree.miscelaneos.MiscelaneosUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonaFragment extends Fragment {

    View view;

    public PersonaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_persona, container, false);

        return view;
    }

    public void onClickEnviarPersona(View view) {
        /** Boton que realiza el envio del argumento*/

        String nombre = ((EditText) view.findViewById(R.id.edit_nombre)).getText().toString();
        String apellidos = ((EditText) view.findViewById(R.id.edit_apellidos)).getText().toString();

        PersonaSerializable persona = new PersonaSerializable(nombre, apellidos);

        PersonaAdd fragmento = new PersonaAdd();
        MiscelaneosUtil util = new MiscelaneosUtil();

        Bundle argumentos = new Bundle();
        argumentos.putSerializable("persona", persona);

        fragmento.setArguments(argumentos);

        /** Metodo de Cambio de fragment*/
        util.remplazarFragment(R.id.contenedor,2,fragmento,getActivity(),"attach");

    }
}
