package com.mycompany.proyectoprogramacion;

public class Tareas {
    private int id;
    private String descripcion;
    private boolean completada;
    private String fechalimite;

    public Tareas(int id, String descripcion, boolean completada, String fechalimite) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
        this.fechalimite = fechalimite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getFechalimite() {
        return fechalimite;
    }

    public void setFechalimite(String fechalimite) {
        this.fechalimite = fechalimite;
    }


}
