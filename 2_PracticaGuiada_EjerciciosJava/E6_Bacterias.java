public class E6_Bacterias {
    public static void main(String[] args) {
        final int INICIO = 100;
        final int LIMITE = 1_000_000;

        int poblacion = INICIO;
        int horas = 0;

        while (poblacion <= LIMITE) {
            poblacion *= 2;
            horas++;
        }

        System.out.println("Población inicial: " + INICIO + " bacterias");
        System.out.println("Supera 1 000 000 en: " + horas + " horas");
        System.out.println("Población final: " + poblacion);
    }
}