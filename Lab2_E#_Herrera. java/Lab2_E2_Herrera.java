/*
 * Nombre completo: Cristhian Herrera
 * NRC: 37712
 * Fecha: 30/10/2026
 * Enunciado: Leer lecturas hasta valor negativo; mostrar cantidad, promedio, max y min.
 */
import java.util.Scanner;

public class Lab2_E2_Herrera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        double suma = 0.0;
        double maximo = 0.0;
        double minimo = 0.0;
        boolean hayDatos = false;
        
        System.out.println("Ingrese lecturas (valor negativo para terminar):");
        double lectura = sc.nextDouble();
        
        // while: repetición depende de valor centinela
        while (lectura >= 0) {
            if (!hayDatos) {
                // Primera lectura: inicializar max y min
                maximo = lectura;
                minimo = lectura;
                hayDatos = true;
            }
            contador++;
            suma += lectura;
            
            if (lectura > maximo) maximo = lectura;
            if (lectura < minimo) minimo = lectura;
            
            lectura = sc.nextDouble();
        }
        
        // Evitar división por cero
        if (hayDatos) {
            double promedio = suma / contador;
            System.out.printf("Lecturas: %d%n", contador);
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.printf("Max: %.2f%n", maximo);
            System.out.printf("Min: %.2f%n", minimo);
        } else {
            System.out.println("No hubo lecturas válidas.");
        }
        sc.close();
    }
}