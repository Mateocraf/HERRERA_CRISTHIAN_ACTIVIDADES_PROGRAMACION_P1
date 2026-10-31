import java.util.Scanner;

public class E1_EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== Ecuación Cuadrática ax² + bx + c = 0 ===");
        System.out.print("Ingresa a: ");
        double a = entrada.nextDouble();
        System.out.print("Ingresa b: ");
        double b = entrada.nextDouble();
        System.out.print("Ingresa c: ");
        double c = entrada.nextDouble();
        
        if (a == 0) {
            System.out.println("El valor de 'a' no puede ser 0, no es ecuación de segundo grado.");
        } else {
            double discriminante = b * b - 4 * a * c;
            
            if (discriminante > 0) {
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Dos raíces reales distintas:");
                System.out.println("x1 = " + raiz1);
                System.out.println("x2 = " + raiz2);
            } else {
                if (discriminante == 0) {
                    double raizDoble = -b / (2 * a);
                    System.out.println("Raíz doble: x = " + raizDoble);
                } else {
                    System.out.println("Sin raíces reales");
                }
            }
        }
        
        entrada.close();
    }
}