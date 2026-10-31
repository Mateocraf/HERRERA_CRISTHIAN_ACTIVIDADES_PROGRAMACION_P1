import java.util.Scanner;
import java.util.Locale;

public class T2_P5_OrdenTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int a = sc.nextInt();
        System.out.print("Número 2: ");
        int b = sc.nextInt();
        System.out.print("Número 3: ");
        int c = sc.nextInt();

        int pri, seg, ter;

        if (a > b && a > c) {
            pri = a;
            if (b > c) { seg = b; ter = c; }
            else { seg = c; ter = b; }
        } else if (b > a && b > c) {
            pri = b;
            if (a > c) { seg = a; ter = c; }
            else { seg = c; ter = a; }
        } else {
            pri = c;
            if (a > b) { seg = a; ter = b; }
            else { seg = b; ter = a; }
        }

        System.out.println("Ordenados de mayor a menor: " + pri + ", " + seg + ", " + ter);
        sc.close();
    }
}