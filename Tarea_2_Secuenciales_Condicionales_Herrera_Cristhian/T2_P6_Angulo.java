import java.util.Scanner;
import java.util.Locale;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ángulo en grados: ");
        double ang = sc.nextDouble();

        // Reducir a rango 0–360
        ang = ang % 360;
        // Si queda negativo (caso borde), ajustar a positivo
        if (ang < 0) ang += 360;

        String tipo;
        if (ang == 360 || ang == 0) {
            tipo = "Completo";
        } else if (ang < 90) {
            tipo = "Agudo";
        } else if (ang == 90) {
            tipo = "Recto";
        } else if (ang < 180) {
            tipo = "Obtuso";
        } else if (ang == 180) {
            tipo = "Llano";
        } else {
            tipo = "Cóncavo";
        }

        System.out.println("Clasificación: " + tipo);
        sc.close();
    }
}