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
public class Reporte extends Estudiante{
    Scanner sc= new Scanner (System.in);
      public static void mostrar(Estudiante e, double promedio, boolean aprobado){
        System.out.println("Estudiante: "+e.nombre);
        System.out.println("Promedio: "+promedio);
        System.out.println("Estado: "+(aprobado? "aprobado":"reprobado"));
    }

}
