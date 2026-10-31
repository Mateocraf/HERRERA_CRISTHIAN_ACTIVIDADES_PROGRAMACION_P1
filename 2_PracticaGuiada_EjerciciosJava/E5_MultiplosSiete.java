public class E5_MultiplosSiete {
    public static void main(String[] args) {
        int contador = 0;

        System.out.println("Múltiplos de 7 entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println("\nCantidad total: " + contador);
    }
}