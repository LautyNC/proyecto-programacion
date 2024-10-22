package com.mycompany.proyectoprogramacion;

public class Finanzas {
    private float ingreso;
    private float gastos;
    private float saldo;

    public Finanzas(float ingreso, float gastos, float saldo) {
        this.ingreso = ingreso;
        this.gastos = gastos;
        this.saldo = saldo;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
