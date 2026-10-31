/*
 * Nombre completo: Cristhian Herrera
 * NRC: 37712
 * Fecha: 30/10/2026
 * Enunciado: Menú repetitivo con consultar, depositar, retirar y salir.
 */
import java.util.Scanner;

public class Lab2_E5_Herrera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 500.0;
        int opcion;
        
        // do-while: mostrar menú al menos una vez
        do {
            System.out.println("\n===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;
                    
                case 2:
                    System.out.print("Monto a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito aceptado.");
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Monto a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro realizado.");
                    } else {
                        System.out.println("Fondos insuficientes o monto inválido.");
                    }
                    break;
                    
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}