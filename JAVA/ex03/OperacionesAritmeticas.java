
package ex03;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Introduce el primer número entero:");
            int numero1 = scanner.nextInt();

            System.out.print("Introduce el segundo número entero:");
            int numero2 = scanner.nextInt();


            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            int division = 0;
            if (numero2 != 0) {
                division = numero1 / numero2;
            } 

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            if (numero2 != 0) {
                System.out.println("División: " + division);
            }
            else {
                System.out.println("No se puede dividir por cero.");
            }
        }
    }
}
