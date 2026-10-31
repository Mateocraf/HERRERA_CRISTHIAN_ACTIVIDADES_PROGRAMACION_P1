import java.util.Scanner;

public class E4_Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double suma = 0;
        int cantidad = 0;

        System.out.println("Ingresa temperaturas. Escribe -99 para terminar:");

        while (true) {
            System.out.print("Temperatura: ");
            double temp = scanner.nextDouble();

            if (temp == -99) {
                break;
            }

            if (temp > mayor) mayor = temp;
            if (temp < menor) menor = temp;
            suma += temp;
            cantidad++;
        }

        if (cantidad == 0) {
            System.out.println("No ingresaste ninguna temperatura");
        } else {
            double promedio = suma / cantidad;
            System.out.println("Mayor temperatura: " + mayor);
            System.out.println("Menor temperatura: " + menor);
            System.out.printf("Promedio: %.2f%n", promedio);
        }

        scanner.close();
    }
}