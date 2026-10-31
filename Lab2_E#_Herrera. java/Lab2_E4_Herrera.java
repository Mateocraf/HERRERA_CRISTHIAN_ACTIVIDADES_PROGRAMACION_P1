/*
 * Nombre completo: Cristhian Herrera
 * NRC: 37712
 * Fecha: 30/10/2026
 * Enunciado: Validar tamaño impar y dibujar rombo de n filas.
 */
import java.util.Scanner;

public class Lab2_E4_Herrera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        // do-while: pedir al menos una vez hasta valor válido
        do {
            System.out.print("Ingrese tamaño impar positivo: ");
            while (!sc.hasNextInt()) {
                System.out.print("Solo números enteros. Intente nuevamente: ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0 || n % 2 == 0);
        
        int mitad = n / 2;
        
        // Parte superior incluyendo fila central
        for (int fila = 0; fila <= mitad; fila++) {
            for (int e = 0; e < mitad - fila; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < 2 * fila + 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Parte inferior
        for (int fila = mitad - 1; fila >= 0; fila--) {
            for (int e = 0; e < mitad - fila; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < 2 * fila + 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}