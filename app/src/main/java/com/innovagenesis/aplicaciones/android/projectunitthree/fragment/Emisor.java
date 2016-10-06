package com.innovagenesis.aplicaciones.android.projectunitthree.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Emisor extends Fragment {

    private IEnviarMensaje implementacion;

    public Emisor() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emisor, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // atrapa los datos

        final EditText editText = (EditText)view.findViewById(R.id.edit_mensaje);

        Button button = (Button)view.findViewById(R.id.btn_enviar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /** Captura lo que tiene el EditText y lo envia*/
                implementacion.enviarMensaje(editText.getText().toString());
            }
        });
    }

    public interface IEnviarMensaje {
    /** Interface encargada de enviar mensaje capturado en este fragment*/
        void enviarMensaje(String mensaje);
    }

}
