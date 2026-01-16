/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejercicio1;
import java.util.*;
/**
 *
 * @author User
 */
public class CalculoPromedio {
    Scanner sc= new Scanner (System.in);
    public static double promedio(double [] notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma= suma+notas[i];
    }
        return suma/notas.length;
}
}
