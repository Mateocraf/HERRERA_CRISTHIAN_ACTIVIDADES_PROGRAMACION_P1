// Autor: Cristhian Herrera
import java.util.Scanner;
import java.util.Locale;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la base del rectángulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = sc.nextDouble();
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        
        sc.close();
    }
}