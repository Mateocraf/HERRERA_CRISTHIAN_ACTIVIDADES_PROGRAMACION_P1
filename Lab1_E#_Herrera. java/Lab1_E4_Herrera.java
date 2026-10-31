import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Herrera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = entrada.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precio = entrada.nextDouble();

        double subtotal = cantidad * precio;
        double iva = subtotal * 0.15;
        double total = subtotal + iva;

        System.out.println("\n--- FACTURA ---");
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);

        System.out.printf("Precio unitario: $%.2f%n", precio);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("IVA (15%%): $%.2f%n", iva);
        System.out.printf("Total a pagar: $%.2f%n", total);

        entrada.close();
    }
}