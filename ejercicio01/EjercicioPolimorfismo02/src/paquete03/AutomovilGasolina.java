/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina  extends Automovil{
    
    int NumeroGalones;
    double costogalon;
    double iva;

    public double getNumeroGalones() {
        return NumeroGalones;
    }

    public void setNumeroGalones(int c) {
        NumeroGalones = c;
    }

    public double getCostogalon() {
        return costogalon;
    }

    public void setCostogalon(double c) {
        costogalon = c;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double c) {
        iva = c;
    }

    @Override
    public void calcularValorcancelar() {
        iva = (iva * costogalon * NumeroGalones);
        valorcanelar = ((NumeroGalones * costogalon) + iva);
    }
      @Override
    public String toString(){
        return String.format("Datos de tipo Estudiante Gasolina\n"
                + "%s",
                super.toString()
                );
    }
    
}
