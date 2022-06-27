/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    
    protected String nombresPropietario;
    protected String placa;
    protected double valorcanelar;
    

    // Método establecerApellidoEstudiante(ape: Cadena)
    public void establecerNombresPropietario(String c){
        nombresPropietario = c;
    }
    
    //  Método establecerIdentificacionEstudiante(iden: Cadena)
    public void establecerPlaca(String c){
        placa = c;
    }

    public abstract void calcularValorcancelar();
    
    //  Métodos obtener para los datos o atributos de la clase
    //  Método obtenerNombresEstudiante() : Cadena
    public String obtenerNombresPropietario(){
        return nombresPropietario;  
    }
 
    // Método obtenerApellidoEstudiante() : Cadena
    public String obtenerPlaca(){
        return placa; 
    }
    
    /*
    Método obtenerMatricula() : Real
        a.  return matricula
        b.  Fin Método obtenerMatricula
    */
    public double obtenerValorcancelar(){
        return valorcanelar;
    }

}