// Autor: Cristhian Herrera
import java.util.Scanner;
import java.util.Locale;

public class T1_P4_MinutosAHoras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de minutos: ");
        int minutos = sc.nextInt();
        
        int horas = minutos / 60;
        int restantes = minutos % 60;
        
        System.out.println(horas + " h " + restantes + " min");
        
        sc.close();
    }
}