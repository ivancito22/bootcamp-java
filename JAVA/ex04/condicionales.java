
package ex04;

import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {

    try    (Scanner scanner = new Scanner(System.in)) {

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}
}
