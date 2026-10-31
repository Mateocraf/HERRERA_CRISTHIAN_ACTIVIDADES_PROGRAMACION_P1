// Autor: Cristhian Herrera
public class T1_P6_AsignacionCompuesta {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("x = " + x);      // Línea 1: 4
        
        x *= 3;
        System.out.println("x = " + x);      // Línea 2: 12
        
        x %= 5;
        System.out.println("x = " + x);      // Línea 3: 2
        
        x += x++;
        System.out.println("x = " + x);      // Línea 4: 4
        
        /* Explicación:
         * x++ devuelve el valor ANTES de incrementar (2), luego x pasa a 3.
         * Se suma: x = 2 + 2 = 4.
         */
    }
}