package com.innovagenesis.aplicaciones.android.projectunitthree;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.innovagenesis.aplicaciones.android.projectunitthree.adapter.AdapterMenuA;
import com.innovagenesis.aplicaciones.android.projectunitthree.container.MenuA;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuAHome extends Fragment {


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

}
