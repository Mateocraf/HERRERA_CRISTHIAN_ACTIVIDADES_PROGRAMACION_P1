import java.util.Scanner;

public class E4_ClasificaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== Clasificación de Triángulo ===");
        System.out.print("Lado 1: ");
        double l1 = entrada.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = entrada.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = entrada.nextDouble();
        
        // Validar que sea triángulo
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("NO forman un triángulo válido.");
        } else {
            if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
                if (l1 == l2 && l2 == l3) {
                    System.out.println("Triángulo EQUILÁTERO");
                } else {
                    if (l1 == l2 || l1 == l3 || l2 == l3) {
                        System.out.println("Triángulo ISÓSCELES");
                    } else {
                        System.out.println("Triángulo ESCALENO");
                    }
                }
            } else {
                System.out.println("NO forman un triángulo válido.");
            }
        }
        
        entrada.close();
    }
}