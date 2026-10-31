import java.util.Scanner;
import java.util.Locale;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese resistencia R1: ");
        double r1 = sc.nextDouble();
        System.out.print("Ingrese resistencia R2: ");
        double r2 = sc.nextDouble();

        // Validar positivos
        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Error: Las resistencias deben ser positivas.");
            sc.close();
            return;
        }

        System.out.print("Ingrese conexión (S=Serie / P=Paralelo): ");
        char tipo = sc.next().charAt(0);

        double req;

        // SOLO condicionales, SIN switch
        if (tipo == 'S' || tipo == 's') {
            req = r1 + r2;
            System.out.printf("Resistencia equivalente en serie = %.2f Ohm%n", req);
        }
        else if (tipo == 'P' || tipo == 'p') {
            req = (r1 * r2) / (r1 + r2);
            System.out.printf("Resistencia equivalente en paralelo = %.2f Ohm%n", req);
        }
        else {
            System.out.println("Error: Tipo de conexión no válido.");
        }

        sc.close();
    }
}