/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasefile.model;

/**
 *
 * @author carlo
 */
public class Discos {
        private long almacenamientoTotal;


        private long almacenamientoOcupado;
        private long almacenamientoDisponible;
        private String Unidad;

    public Discos(String Unidad ,long almacenamientoTotal, 
            long almacenamientoOcupado,
            long almacenamientoDisponible) {
        this.almacenamientoTotal = almacenamientoTotal;
        this.almacenamientoOcupado = almacenamientoOcupado;
        this.Unidad = Unidad;
        this.almacenamientoDisponible = almacenamientoDisponible;
    }

    public Discos() {
    }

    @Override
    public String toString() {
        return "Discos{" + "almacenamientoTotal=" + almacenamientoTotal + ", almacenamientoOcupado=" + almacenamientoOcupado + ", almacenamientoDisponible=" + almacenamientoDisponible + ", Unidad=" + Unidad + '}';
    }
    
    public long getAlmacenamientoTotal() {
        return almacenamientoTotal;
    }

    public long getAlmacenamientoOcupado() {
        return almacenamientoOcupado;
    }

    public long getAlmacenamientoDisponible() {
        return almacenamientoDisponible;
    }

    public String getUnidad() {
        return Unidad;
    }

        
}
