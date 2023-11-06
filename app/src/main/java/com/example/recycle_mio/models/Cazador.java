package com.example.recycle_mio.models;

public class Cazador {

    private String nombre;
    private String rango;
    private Espada espada;

    public Cazador(String nombre, String rango, Espada espada){
        this.nombre = nombre;
        this.rango = rango;
        this.espada = espada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public Espada getEspada() {
        return espada;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }
}
