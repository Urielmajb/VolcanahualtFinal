package com.example.hp.volcanahualt;

/**
 * Created by Owner on 05/11/2016.
 */
public class Volcanes {

    private int imagen;
    private String nombre;
    private String informacion;


    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInformacion(){
        return informacion;
    }

    public Volcanes(int imagen, String nombre, String informacion){
        this.imagen=imagen;
        this.nombre=nombre;
        this.informacion=informacion;
    }
}
