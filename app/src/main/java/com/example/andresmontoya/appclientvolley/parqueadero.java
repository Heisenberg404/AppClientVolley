package com.example.andresmontoya.appclientvolley;

/**
 * Created by andres.montoya on 23/09/2016.
 */
public class parqueadero {
    Integer id;
    String nombre;

    public parqueadero(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public parqueadero() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
