package com.innovagenesis.aplicaciones.android.projectunitthree;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.innovagenesis.aplicaciones.android.projectunitthree.adapter.AdapterMenuA;
import com.innovagenesis.aplicaciones.android.projectunitthree.container.MenuA;
import com.innovagenesis.aplicaciones.android.projectunitthree.fragment.ContenedorComunicacionFragmnet;
import com.innovagenesis.aplicaciones.android.projectunitthree.fragment.MensajeFragment;
import com.innovagenesis.aplicaciones.android.projectunitthree.miscelaneos.MiscelaneosUtil;

import java.util.ArrayList;

/**
 * Administra los frgaments del menu
 */
public class MenuAHome extends Fragment implements AdapterView.OnItemClickListener {

    public MenuAHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_ahome, container, false);

        AdapterMenuA adapter = new AdapterMenuA(getContext(),items());

        GridView grid = (GridView)view.findViewById(R.id.gridMenuA);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(this);

        return view;
    }

    private ArrayList<MenuA> items() {

        TypedArray colorImgMA = getResources().obtainTypedArray(R.array.colorImgMenuA);
        TypedArray imgMenuA = getResources().obtainTypedArray(R.array.imgMenuA);
        String[] titleMenuA = getResources().getStringArray(R.array.titleAMenuA);
        String[] descMenuA = getResources().getStringArray(R.array.descBMenuA);

        ArrayList<MenuA> lista = new ArrayList<>();

        for (int i = 0; i < imgMenuA.length(); i++){

            lista.add(new MenuA(
                    colorImgMA.getResourceId(i,0),
                    imgMenuA.getResourceId(i,0),
                    titleMenuA[i],
                    descMenuA[i]));
        }

        return lista;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;

        MiscelaneosUtil util = new MiscelaneosUtil();

        switch (position){

            case 0: {

                /** Hace la comunicacion de los fragmentos mediante el Bundle
                 * comunicacion simple de datos*/

                fragment = new MensajeFragment();

                Bundle argmentos = new Bundle();
                argmentos.putString("cadena", "Bienvenido a Next University.");
                argmentos.putInt("entero", 1);
                argmentos.putFloat("decimal", 2.3f);

                util.remplazarFragment(R.id.content_main,2,fragment,getActivity()).commit();
                fragment.setArguments(argmentos);
                break;

            }

            case 1:{

                fragment = new ContenedorComunicacionFragmnet();
                util.remplazarFragment(R.id.content_main,2,fragment,getActivity()).commit();
                break;
            }
        }

    }
}
