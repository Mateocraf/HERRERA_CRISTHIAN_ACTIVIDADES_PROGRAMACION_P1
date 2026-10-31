import java.util.Scanner;

public class E5_ConversionUnidades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println("1) Metros → Pies");
        System.out.println("2) Kilogramos → Libras");
        System.out.println("3) Celsius → Fahrenheit");
        System.out.print("Elige una opción (1-3): ");
        int opcion = entrada.nextInt();
        
        if (opcion == 1) {
            System.out.print("Valor en metros: ");
            double metros = entrada.nextDouble();
            double pies = metros * 3.28084;
            System.out.printf("%.2f m = %.2f pies%n", metros, pies);
        } else {
            if (opcion == 2) {
                System.out.print("Valor en kg: ");
                double kg = entrada.nextDouble();
                double libras = kg * 2.20462;
                System.out.printf("%.2f kg = %.2f lb%n", kg, libras);
            } else {
                if (opcion == 3) {
                    System.out.print("Valor en °C: ");
                    double celsius = entrada.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
                } else {
                    System.out.println("Opción no válida.");
                }
            }
        }
        
        entrada.close();
    }
}