/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidadejercicio1;
import java.util.*;
/**
 *
 * @author User
 */
public class MODULARIDADejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner (System.in);
         
         Estudiante e = new Estudiante ();
        e.registrar();
        System.out.println("Ingrese el numero de notas: ");
        int n= sc.nextInt(); sc.nextLine();
                 e.notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota" +(i+1)+":");
            
            e.notas[i]= sc.nextDouble(); 
        }
        double promedio= CalculoPromedio.promedio(e.notas);
        boolean aprobado = aprueba.aprueba(promedio);
        System.out.println("Desea aplicar el punto extra?\n 1:si \n2:no");
        int op=sc.nextInt();
        sc.nextLine();
        if (op==1){
            double promedioE= PuntoEx.puntoExtra(promedio);
            Reporte.mostrar(e, promedioE, aprobado);
            
        }else{
            Reporte.mostrar(e, promedio, aprobado);
        }
        
        sc.close();
    }
    
}
