package com.innovagenesis.aplicaciones.android.projectunitthree.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;
import com.innovagenesis.aplicaciones.android.projectunitthree.container.PersonaSerializable;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonaAdd extends Fragment {


    public PersonaAdd() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persona_add, container, false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        Bundle argumentos = getArguments();
        if (argumentos != null) {

            /** Para poder enviar un Objeto la clase debe ser implementada con Serializable */

            PersonaSerializable persona = (PersonaSerializable) argumentos.getSerializable("persona");

            ((TextView) view.findViewById(R.id.txt_nombre_completo)).setText(persona.toString());
        }
    }

}
