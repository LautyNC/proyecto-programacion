package com.mycompany.proyectoprogramacion;

public class Salud {
    private float peso;
    private float altura;
    private String caloriasconsumidas;
    private String caloriasquemadas;

    public Salud(float peso, float altura, String caloriasconsumidas, String caloriasquemadas) {
        this.peso = peso;
        this.altura = altura;
        this.caloriasconsumidas = caloriasconsumidas;
        this.caloriasquemadas = caloriasquemadas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCaloriasconsumidas() {
        return caloriasconsumidas;
    }

    public void setCaloriasconsumidas(String caloriasconsumidas) {
        this.caloriasconsumidas = caloriasconsumidas;
    }

    public String getCaloriasquemadas() {
        return caloriasquemadas;
    }

    public void setCaloriasquemadas(String caloriasquemadas) {
        this.caloriasquemadas = caloriasquemadas;
    }


}
