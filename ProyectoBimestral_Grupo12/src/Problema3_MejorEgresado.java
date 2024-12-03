/**
 *
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Problema3_MejorEgresado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, mejorEgresado1, mejorEgresado2;
        double promedio, mejorProm1, mejorProm2;
        int contador = 0, limite;
        mejorEgresado1 = "";
        mejorProm1 = 0.0;
        mejorEgresado2 = "";
        mejorProm2 = 0.0;
        System.out.println("Ingrese el numero de estudiantes con mejores promedios");
        limite = tcl.nextInt();
        while (contador < limite) {
            System.out.println("Ingrese el nombre del estudiante " + (contador + 1) + ":");
            nombre = tcl.next();
            System.out.println("Ingrese el promedio de " + nombre + ":");
            promedio = tcl.nextDouble();
            if (promedio > mejorProm1) {
                mejorProm2 = mejorProm1;
                mejorEgresado2 = mejorEgresado1;
                mejorProm1 = promedio;
                mejorEgresado1 = nombre;
            } else if (promedio == mejorProm1) {
                mejorProm2 = promedio;
                mejorEgresado2 = nombre;
            }
            contador++;
        }
        System.out.println("\nMejor(es) egresado(s):");
        System.out.println("Nombre: " + mejorEgresado1 + ", Promedio: " + mejorProm1);
        if (!mejorEgresado2.isEmpty() && mejorProm1 == mejorProm2) {
            System.out.println("Nombre: " + mejorEgresado2 + ", Promedio: " + mejorProm2);
            System.out.println("Se eligieron dos mejores egresados debido a un empate en el promedio.");
        }
    }
}
/***
 * run:
 Ingrese el numero de estudiantes con mejores promedios
 5
 Ingrese el nombre del estudiante 1:
 Francis
 Ingrese el promedio de Francis:
 9.95
 Ingrese el nombre del estudiante 2:
 Ana
 Ingrese el promedio de Ana:
 9.76
 Ingrese el nombre del estudiante 3:
 Javier
 Ingrese el promedio de Javier:
 9.98
 Ingrese el nombre del estudiante 4:
 Valentina
 Ingrese el promedio de Valentina:
 9.98
 Ingrese el nombre del estudiante 5:
 Fernando
 Ingrese el promedio de Fernando:
 9.82

 Mejor(es) egresado(s):
 Nombre: Javier, Promedio: 9.98
 Nombre: Valentina, Promedio: 9.98
 Se eligieron dos mejores egresados debido a un empate en el promedio.
 BUILD SUCCESSFUL (total time: 1 minute 11 seconds)
 */
