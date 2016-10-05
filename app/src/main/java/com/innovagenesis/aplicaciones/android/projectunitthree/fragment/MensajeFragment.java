package com.innovagenesis.aplicaciones.android.projectunitthree.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MensajeFragment extends Fragment {

    private String parametro1;
    private int parametro2;
    private float parametro3;



    public MensajeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mensaje, container, false);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle argumento = getArguments();

        if (argumento != null) {
            parametro1 = argumento.getString("cadena");
            parametro2 = argumento.getInt("entero");
            parametro3 = argumento.getFloat("decimal");
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ((TextView) view.findViewById(R.id.txtParametro1)).setText(parametro1);
        ((TextView) view.findViewById(R.id.txtParametro2)).setText(String.valueOf(parametro2));
        ((TextView) view.findViewById(R.id.txtParametro3)).setText(String.valueOf(parametro3));
    }


}
