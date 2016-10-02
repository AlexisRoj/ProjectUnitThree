package com.innovagenesis.aplicaciones.android.projectunitthree.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.projectunitthree.R;
import com.innovagenesis.aplicaciones.android.projectunitthree.container.MenuA;

import java.util.ArrayList;

/**
 * Carga los elementos del Grid
 */

public class AdapterMenuA extends BaseAdapter {


    private ArrayList<MenuA> items;
    private Context context;

    public AdapterMenuA(Context context, ArrayList<MenuA> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public MenuA getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("NewApi")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = convertView;

        if (convertView == null) {

            view = inflater.inflate(R.layout.template_menu_a, null);
        }
        /**Enlaza el template con sus elementos*/

        ImageView imgMenuA = (ImageView) view.findViewById(R.id.imgMenuA);
        TextView txtAMenuA = (TextView) view.findViewById(R.id.txtAMenuA);
        TextView txtBMenuA = (TextView) view.findViewById(R.id.txtBMenuA);


        /**Utiliza el template como recurso de los datos que se van a cargar*/

        imgMenuA.setImageResource(getItem(position).getImgAmenuA());
        txtAMenuA.setText(getItem(position).getTxtAMenuA());
        txtBMenuA.setText(getItem(position).getTxtBMenuA());

        /** Seccion para propiedades de los elementos */

        imgMenuA.setBackgroundResource(getItem(position).getColorImgBGMA());
        txtAMenuA.setTextColor(ContextCompat.getColor(context, getItem(position).getColorImgBGMA()));

        return view;
    }
}
