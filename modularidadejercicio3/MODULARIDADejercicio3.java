/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MODULARIDADejercicio3;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class MODULARIDADejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        AsistenciaCalculatorImpl c = new AsistenciaCalculatorImpl();
        AsistenciaValidatorImpl v = new AsistenciaValidatorImpl();
        ReporteEstudiante reporte = new ReporteEstudiante();

        System.out.print("Ingrese el estudiante: ");
        String nombre = sc.nextLine();
	System.out.println("Ingrese los dias de asistencia");
	int a = sc.nextInt();
	sc.nextLine();
        int[] asistencias = new int[a];
        System.out.println("Ingrese la asistencia (1 = asistio, 0 = falto):");

        for (int i = 0; i < asistencias.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            asistencias[i] = sc.nextInt();
        }

        double porcentaje = c.calcularPorcentaje(asistencias);
        boolean cumple = v.cumple(porcentaje);

        reporte.mostrar(nombre, porcentaje, cumple);

        sc.close();
    }
    
}
