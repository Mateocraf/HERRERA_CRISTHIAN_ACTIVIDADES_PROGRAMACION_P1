import java.util.Locale;
import java.util.Scanner;

public class Lab1_E5_Herrera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese el valor de a: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = entrada.nextInt();

        // Proceso y salida
        System.out.println("\n--- EVALUACION DE EXPRESIONES ---");

        if (b != 0) {
            int divisionEntera = a / b;
            double divisionReal = (double) a / b;
            int residuo = a % b;

            System.out.println("Division entera: " + divisionEntera);
            System.out.printf("Division real: %.2f%n", divisionReal);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println(
                "No se puede dividir para cero."
            );
        }

        boolean mayor = a > b;
        boolean iguales = a == b;
        boolean resultadoLogico = (a > b) && (b > 0);

        System.out.println("a > b: " + mayor);
        System.out.println("a == b: " + iguales);
        System.out.println("Resultado logico: " + resultadoLogico);

        entrada.close();
    }
}