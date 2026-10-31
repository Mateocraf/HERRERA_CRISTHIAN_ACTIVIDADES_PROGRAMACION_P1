import java.util.Scanner;

public class E2_AnioBisiesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== Verificar Año Bisiesto ===");
        System.out.print("Ingresa el año: ");
        int anio = entrada.nextInt();
        
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    System.out.println("El año " + anio + " SÍ es bisiesto.");
                } else {
                    System.out.println("El año " + anio + " NO es bisiesto.");
                }
            } else {
                System.out.println("El año " + anio + " SÍ es bisiesto.");
            }
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
        
        entrada.close();
    }
}