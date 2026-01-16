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
public class Estudiante {
    Scanner sc= new Scanner (System.in);
    protected String nombre,materia ;
    protected double [] notas;

    public Estudiante(String nombre, String materia, double[] notas) {
        this.nombre = nombre;
        this.materia = materia;
        this.notas = notas;
    }

    public Estudiante() {
    }

    public  void registrar(){
        System.out.println("Nombre del estudiante: ");
        nombre= sc.nextLine();
        System.out.println("Materia registrada: ");
        materia= sc.nextLine();

    }
}
