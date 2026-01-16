/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidadejercicio2;

/**
 *
 * @author User
 */
public class MODULARIDADejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e= new Estudiante();
        e.registrar();
        
        CalculoPromedio.promedio(e.notas);
        CalculoPromedioEx.promedio(e.notas);
    }
    
}
