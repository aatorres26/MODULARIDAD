/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejercicio2;

/**
 *
 * @author User
 */
public class CalculoPromedioEx {
        public static void promedio(double [] notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma= suma+(notas[i]+0.5);
    }
            System.out.println("Su promedio mas extras es: "+(suma/notas.length));
}
}
