import java.util.Scanner;

public class E1_SumaNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1");
            scanner.close();
            return;
        }

        int sumaCiclo = 0;
        for (int i = 1; i <= n; i++) {
            sumaCiclo += i;
        }

        int sumaFormula = n * (n + 1) / 2;

        System.out.println("Suma con ciclo: " + sumaCiclo);
        System.out.println("Suma con fórmula n(n+1)/2: " + sumaFormula);

        if (sumaCiclo == sumaFormula) {
            System.out.println(" Resultados coinciden");
        } else {
            System.out.println(" Hay diferencia");
        }

        scanner.close();
    }
}