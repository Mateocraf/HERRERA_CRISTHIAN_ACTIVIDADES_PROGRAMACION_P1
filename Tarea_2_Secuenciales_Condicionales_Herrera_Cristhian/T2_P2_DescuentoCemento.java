import java.util.Scanner;
import java.util.Locale;

public class T2_P2_DescuentoCemento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Constantes como pide el deber (final = valor fijo)
        final double PRECIO_SACO = 8.50;
        final double IVA = 0.15;
        final double DESCUENTO_5 = 0.05;
        final double DESCUENTO_10 = 0.10;

        System.out.print("Cantidad de sacos de cemento: ");
        int cantidad = sc.nextInt();

        double subtotal = cantidad * PRECIO_SACO;
        double descuento;

        if (cantidad <= 20) {
            descuento = 0;
        } else if (cantidad <= 50) {
            descuento = subtotal * DESCUENTO_5;
        } else {
            descuento = subtotal * DESCUENTO_10;
        }

        double neto = subtotal - descuento;
        double ivaValor = neto * IVA;
        double total = neto + ivaValor;

        System.out.printf("Subtotal: $ %.2f%n", subtotal);
        System.out.printf("Descuento: $ %.2f%n", descuento);
        System.out.printf("IVA (15%%): $ %.2f%n", ivaValor);
        System.out.printf("TOTAL A PAGAR: $ %.2f%n", total);

        sc.close();
    }
}