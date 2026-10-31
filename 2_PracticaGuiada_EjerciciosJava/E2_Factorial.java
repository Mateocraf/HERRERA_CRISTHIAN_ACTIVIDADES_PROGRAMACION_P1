import java.util.Scanner;

public class E2_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingresa n (debe ser ≥ 0): ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Error: Valor inválido. Intenta de nuevo.");
            }
        } while (n < 0);

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);

        if (n >= 13) {
            System.out.println("Advertencia: 13! en adelante se acerca al límite de almacenamiento");
        }
        if (n >= 20) {
            System.out.println("Advertencia: 20! excede el límite de tipo int");
        }

        scanner.close();
    }
}