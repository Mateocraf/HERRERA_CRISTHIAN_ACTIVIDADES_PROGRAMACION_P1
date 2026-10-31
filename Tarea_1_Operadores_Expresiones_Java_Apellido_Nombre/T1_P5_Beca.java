// Autor: Cristhian Herrera
import java.util.Scanner;
import java.util.Locale;

public class T1_P5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la edad: ");
        int edad = sc.nextInt();
        
        System.out.print("Ingresa el promedio: ");
        double promedio = sc.nextDouble();
        
        System.out.println(edad <= 25 && promedio >= 8.5);
        
        sc.close();
    }
}