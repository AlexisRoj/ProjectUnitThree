package com.innovagenesis.aplicaciones.android.projectunitthree.container;

import java.io.Serializable;

/**
 * Created by Alexis on 4/10/2016.
 * Administra los elementos que seran enviados en el objeto
 */

public class PersonaSerializable implements Serializable{

    private String nombre;
    private String apellidos;

    public PersonaSerializable(String apellidos, String nombre) {
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
