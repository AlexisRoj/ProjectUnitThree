package com.innovagenesis.aplicaciones.android.projectunitthree.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;


public class ContenedorComunicacionFragmnet extends Fragment implements Emisor.IEnviarMensaje {
/** Es necesario implementar la interface q va a comunicar a los fragments*/
    public ContenedorComunicacionFragmnet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contenedor_comunicacion_fragmnet, container, false);
    }


    @Override
    public void enviarMensaje(String mensaje) {

        /** Se instancia el fragment receptor*/
        Fragment fragment = getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment_receptor);

        if (fragment instanceof Receptor){
            Receptor receptor = (Receptor)fragment;
            receptor.actualizarVista(mensaje);
        }

    }
}
