package com.upiiz.dm_batrb_06.model;

public class User {
    private Long id;
    private String nombre;
    private String utimoMensaje;
    private String ultimaConexion;
    private int imagen;

    public User() {
    }

    public User(Long id, String nombre, String utimoMensaje, String ultimaConexion, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.utimoMensaje = utimoMensaje;
        this.ultimaConexion = ultimaConexion;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtimoMensaje() {
        return utimoMensaje;
    }

    public void setUtimoMensaje(String utimoMensaje) {
        this.utimoMensaje = utimoMensaje;
    }

    public String getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(String ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
