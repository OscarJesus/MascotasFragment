package com.oscarjesus.mascotas.pojo;

/**
 * Created by OscarJesús on 27/05/2016.
 */


public class Mascota {
    private int foto;
    private String nombre;
    private String like;

    public Mascota(int foto, String nombre, String like){
        this.foto = foto;
        this.nombre = nombre;
        this.like = like;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}