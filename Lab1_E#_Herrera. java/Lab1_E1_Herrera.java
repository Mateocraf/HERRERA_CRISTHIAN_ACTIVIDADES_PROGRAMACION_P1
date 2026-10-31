import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Herrera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("Temperatura en Fahrenheit: %.2f °F%n",
                          fahrenheit);

        entrada.close();
    }
}