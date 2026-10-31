// Autor: Cristhian Herrera
import java.util.Scanner;
import java.util.Locale;

public class T1_P2_EsPar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();
        
        System.out.println(numero % 2 == 0);
        
        sc.close();
    }
}