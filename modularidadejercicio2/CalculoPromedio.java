/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejercicio2;

/**
 *
 * @author User
 */
public class CalculoPromedio implements Promedio {
        @Override
        public void promedio(double [] notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma= suma+notas[i];
    }
        System.out.println("Su promedio es: "+(suma/notas.length));
}
}
