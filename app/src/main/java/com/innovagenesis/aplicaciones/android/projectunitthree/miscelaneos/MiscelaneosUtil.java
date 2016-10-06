package com.innovagenesis.aplicaciones.android.projectunitthree.miscelaneos;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Alexis on 4/10/2016.
 */

public class MiscelaneosUtil {

    public MiscelaneosUtil() {
        //Constructor
    }

    public FragmentTransaction remplazarFragment
            (int contenedor,int tipo,Fragment fragment,FragmentActivity activity) {
        /**    Encargada de cambiar los fragments en el contenedor
         *
         *   El primer elemento es el contendor que se va a cambiar
         *   El segundo es el tipo de accion
         *   El tercero es el fragment que va a sustituir el contenedor
         *   El cuarto es el contexto de la actividad
         *
         ***/

        FragmentManager fm = activity.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (tipo == 1) {
            ft.addToBackStack(null).add(contenedor, fragment);
        } else {
            ft.addToBackStack(null).replace(contenedor, fragment);
        }

        return ft;

    }
}




