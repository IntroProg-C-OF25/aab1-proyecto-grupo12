/**
 *
 * @author Jorge Fernández
 */
import java.util.Random;
import java.util.Scanner;
public class Problema2_SistemaAcademicoUPTL {
public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el numero de estudiantes en el curso: ");
        int numEstudiantes = tcl.nextInt();
        tcl.nextLine();
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            String nombre = "Estudiante_" + (random.nextInt(9000) + 1000);
            String cedula = String.valueOf(random.nextInt(90000000) + 10000000);
            String materia = "Materia_" + (random.nextInt(5) + 1);
            double acd = Math.round(random.nextDouble() * 3.5 * 100.0) / 100.0;
            double ape = Math.round(random.nextDouble() * 3.5 * 100.0) / 100.0;
            double aa = Math.round(random.nextDouble() * 3.0 * 100.0) / 100.0;
            double sumaCalificaciones = acd + ape + aa;
            double porcentaje = (sumaCalificaciones / 10.0) * 100.0;
            boolean aprobado = porcentaje >= 70.0;
            double examenRecuperacion = 0.0;
            if (!aprobado) {
                examenRecuperacion = Math.round(random.nextDouble() * 3.5 * 100.0) / 100.0;
                double porcentajeFinal = (sumaCalificaciones * 0.6) + examenRecuperacion;
                aprobado = porcentajeFinal >= 7.0;
            }
            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + nombre);
            System.out.println("Cedula: " + cedula);
            System.out.println("Materia: " + materia);
            System.out.println("Calificaciones:");
            System.out.println("  ACD: " + acd + "/3.5");
            System.out.println("  APE: " + ape + "/3.5");
            System.out.println("  AA: " + aa + "/3.0");
            System.out.println("Suma total: " + sumaCalificaciones + "/10");
            System.out.println("Porcentaje: " + porcentaje + "%");
            if (aprobado) {
                System.out.println("Estado: APROBADO");
                aprobados++;
            } else {
                System.out.println("Estado: REPROBADO (con examen de recuperacion)");
                System.out.println("Nota del examen de recuperacion: " + examenRecuperacion + "/3.5");
                reprobados++;
            }
        }
        System.out.println("\nEstadisticas del curso:");
        System.out.printf("Porcentaje de aprobacion: %.2f%%\n", (aprobados / (double) numEstudiantes) * 100);
        System.out.printf("Porcentaje de reprobacion: %.2f%%\n", (reprobados / (double) numEstudiantes) * 100);
    }
}
/**
 * Ingrese el numero de estudiantes en el curso: 2
 * Estudiante 1:
 * Nombre: Estudiante_4504
 * Cedula: 99670922
 * Materia: Materia_2
 * Calificaciones:
 * ACD: 0.26/3.5
 * APE: 1.17/3.5
 * AA: 2.69/3.0
 * Suma total: 4.12/10
 * Porcentaje: 41.2%
 * Estado: REPROBADO (con examen de recuperacion)
 * Nota del examen de recuperacion: 2.99/3.5
 * Estudiante 2:
 * Nombre: Estudiante_6902
 * Cedula: 60022471
 * Materia: Materia_4
 * Calificaciones:
 * ACD: 3.44/3.5
 * APE: 3.49/3.5
 * AA: 1.62/3.0
 * Suma total: 8.55/10
 * Porcentaje: 85.50000000000001%
 * Estado: APROBADO
 * Estadisticas del curso:
 * Porcentaje de aprobacion: 50,00%
 * Porcentaje de reprobacion: 50,00%
 * BUILD SUCCESSFUL (total time: 4 seconds)
 * 
 */