/*
 * Nombre completo: Cristhian Herrera
 * NRC: 37712
 * Fecha: 30/10/2026
 * Enunciado: Generar número aleatorio 1-100; usuario tiene 7 intentos para adivinarlo.
 */
import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Herrera {
    public static void main(String[] args) {
        Random azar = new Random();
        int numeroSecreto = azar.nextInt(100) + 1;
        
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        final int MAX_INTENTOS = 7;
        int intentoUsuario;
        boolean acertado = false;
        
        System.out.println("=== ADIVINA EL NÚMERO (1-100) ===");
        System.out.println("Tienes " + MAX_INTENTOS + " intentos.");
        
        // do-while: al menos un intento siempre
        do {
            System.out.print("Intento " + (intentos + 1) + ": ");
            intentoUsuario = sc.nextInt();
            intentos++;
            
            if (intentoUsuario == numeroSecreto) {
                acertado = true;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("Más alto");
            } else {
                System.out.println("Más bajo");
            }
        } while (!acertado && intentos < MAX_INTENTOS);
        
        if (acertado) {
            System.out.println("¡Acertaste en " + intentos + " intento(s)!");
        } else {
            System.out.println("Agotaste los " + MAX_INTENTOS + " intentos.");
            System.out.println("El número era: " + numeroSecreto);
        }
        sc.close();
    }
}