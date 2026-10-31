import java.util.Locale;
import java.util.Scanner;

public class Lab1_E3_Herrera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de tres cifras: ");
        int numero = entrada.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println(
                "Error: ingrese un numero entre 100 y 999."
            );
        } else {
            int centenas = numero / 100;
            int decenas = (numero % 100) / 10;
            int unidades = numero % 10;

            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
        }

        entrada.close();
    }
}