import java.util.Scanner;

public class E3_TarifaParqueadero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PRIMERA_HORA = 1.00;
        final double HORA_ADICIONAL = 0.50;
        final double TOPE_DIARIO = 6.00;
        
        System.out.println("=== Tarifa de Parqueadero ===");
        System.out.print("Horas de permanencia: ");
        double horas = entrada.nextDouble();
        
        double total;
        
        if (horas <= 1) {
            total = PRIMERA_HORA;
        } else {
            total = PRIMERA_HORA + (horas - 1) * HORA_ADICIONAL;
        }
        
        if (total > TOPE_DIARIO) {
            total = TOPE_DIARIO;
        }
        
        System.out.printf("Total a pagar: $%.2f%n", total);
        entrada.close();
    }
}