package com.mossoveterinary.dogar.models;

/**
 * Created by developer on 01/11/17.
 */

public class NObjeto {


    private  String nombre1;
    private String nombre2;

    public NObjeto(String nombre1, String nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
}
