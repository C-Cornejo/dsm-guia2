package com.udb.dsm.guia2;

import android.text.Editable;

import java.io.Serializable;

public class Trabajador implements Serializable {

    private final double ISSS       = 0.02;
    private final double AFP        = 0.03;
    private final double RENTA      = 0.04;
    private final double HORA_DOLAR = 8.50;

    private String nombre;
    private double horas;
    private double salario;
    private double descuento;
    private double total;


    public  Trabajador(){}
    public  Trabajador(String nombre, double horas){
        this.nombre = nombre;
        this.horas  = horas;
        this.calcularSalario();
        this.calcularDescuento();
    }

    public void calcularSalario()
    {
        salario = horas * HORA_DOLAR;
    }
    public void calcularDescuento()
    {
        descuento = (salario*ISSS)+(salario*AFP)+(salario*RENTA);
        total = salario - descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }
}
