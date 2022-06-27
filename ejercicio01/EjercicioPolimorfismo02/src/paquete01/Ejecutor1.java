/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante = 0;
        String continuar;
        int contador;
        String placa;
        int tipoAutomovil;
        double cosotgalones;
        int numerogalones;
        double iva;
        
   // galones 20
   // 3 dolares 
   // iva 10%
        ArrayList<Automovil> at = new ArrayList<>();
        // inicio de solución
              do {
            System.out.println("Reporte de Datos"
                    +"Seleccione el objeto de tipo Automovil a crear\n"
                    + "Ingrese (1) para Automovil Gasolina\n"
                    + "Ingrese (2) para Automovil Diesel\n");
            tipoAutomovil = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese los nombres del propietario");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese la placa del propietario");
            placa = entrada.nextLine();
            
            if (tipoEstudiante == 1) {
                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
               AutomovilGasolina g1 = new AutomovilGasolina();
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el numero de galones");
                numerogalones = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el costo de cada galon");
                cosotgalones = Double.parseDouble(entrada.nextLine());
                System.out.println("Ingrese el iva ");
                iva = Double.parseDouble(entrada.nextLine());
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                
                g1.establecerNombresPropietario(nombresEst);
                g1.establecerPlaca(placa);
                g1.setNumeroGalones(numerogalones);
                g1.setCostogalon(cosotgalones);
                g1.setIva(iva);
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
//                estudiantes[contador] = estudianteP;
                at.add(g1);
            } else {
                if (tipoEstudiante == 2) {
                    AutomovilDiesel g2 = new  AutomovilDiesel();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = Double.parseDouble(entrada.nextLine());
                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    e2.establecerNombresEstudiante(nombresEst);
                    e2.establecerApellidoEstudiante(apellidosEst);
                    e2.establecerIdentificacionEstudiante(identificacionEst);
                    e2.establecerEdadEstudiante(edadEst);
                    e2.establecerNumeroAsginaturas(numeroAsigs);
                    e2.establecerCostoAsignatura(costoAsig);
                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudianteDistancia
                    estudiantes.add(e2);
                }else{
                    System.out.println("Opción fuera de rango");
                }
            }
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");
            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("S"));
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            System.out.printf("Datos Estudiante :"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
    }
}
