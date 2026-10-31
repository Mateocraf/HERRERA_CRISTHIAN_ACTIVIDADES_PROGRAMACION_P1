/*
 * Nombre completo: Cristhian Herrera
 * NRC: 37712
 * Fecha: 30/10/2026
 * Enunciado: Imprimir la tabla de multiplicar del 1 al 10 en matriz 10×10 alineada.
 */
public class Lab2_E1_Herrera {
    public static void main(String[] args) {
        // Ciclos for anidados: se conoce el número de repeticiones
        for (int fila = 1; fila <= 10; fila++) {
            for (int columna = 1; columna <= 10; columna++) {
                // Ancho fijo de 4 caracteres para alineación
                System.out.printf("%4d", fila * columna);
            }
            System.out.println();
        }
    }
}