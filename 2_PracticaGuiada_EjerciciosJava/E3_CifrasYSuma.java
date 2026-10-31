import java.util.Scanner;

public class E3_CifrasYSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        numero = Math.abs(numero);

        int contadorCifras = 0;
        int sumaCifras = 0;
        int n = numero;

        while (n != 0) {
            int digito = n % 10;
            sumaCifras += digito;
            contadorCifras++;
            n = n / 10;
        }

        if (numero == 0) {
            contadorCifras = 1;
            sumaCifras = 0;
        }

        System.out.println("Cantidad de cifras: " + contadorCifras);
        System.out.println("Suma de las cifras: " + sumaCifras);

        scanner.close();
    }
}