package com.innovagenesis.aplicaciones.android.projectunitthree.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Receptor extends Fragment {

    private TextView textMensaje;

    public Receptor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receptor, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /** Este es el elemento que va a mostrar el resultado*/
        this.textMensaje = (TextView)view.findViewById(R.id.text_mensaje);
    }

    public void actualizarVista(String mensaje){
        this.textMensaje.setText(mensaje);
    }
}
