import java.util.Scanner;
import java.util.Locale;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota parcial 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota parcial 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota parcial 3: ");
        double n3 = sc.nextDouble();

        double prom = (n1 + n2 + n3) / 3.0;
        System.out.printf("Promedio: %.2f%n", prom);

        if (prom >= 14.0) {
            System.out.println("Aprobado");
        } else if (prom >= 9.0) {
            System.out.println("Supletorio");
        } else {
            System.out.println("Reprobado");
        }

        sc.close();
    }
}