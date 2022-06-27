/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
   double numerolitros;
   double costolitro;
   double descuento;

    public double getNumerolitros() {
        return numerolitros;
    }

    public void setNumerolitros(double c) {
        numerolitros = c;
    }

    public double getCostolitro() {
        return costolitro;
    }

    public void setCostolitro(double c) {
        costolitro = c;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double c) {
        descuento = costolitro * 0.05;
    }

    @Override
    public void calcularValorcancelar() {
        valorcanelar = (costolitro * descuento);
    }
   
   
    
}
