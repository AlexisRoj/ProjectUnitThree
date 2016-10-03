package com.innovagenesis.aplicaciones.android.projectunitthree.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Clase encargada de adnistrar el desplazamiento
 */

public class SwipeDesplazamiento extends FragmentPagerAdapter {

    public SwipeDesplazamiento(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new ProgramacionAyer();
        }
        if(position == 1){
            return new ProgramacionHoy();
        }
        else{
            return new ProgramacionManana();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
