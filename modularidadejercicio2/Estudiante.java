/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidadejercicio2;
import java.util.*;
/**
 *
 * @author User
 */
public class Estudiante {
     Scanner sc= new Scanner (System.in);
    protected String nombre ;
    protected double [] notas;

    public Estudiante() {
    }

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
   public void registrar(){
       System.out.println("nombre del Estudiante:");
       nombre= sc.nextLine();
        System.out.println("Ingrese el numero de notas: ");
        int n= sc.nextInt(); sc.nextLine();
                 notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota " +(i+1)+":");
            
            notas[i]= sc.nextDouble(); 
        }
   }
    
    
}
