package UTILIDADES.sheet03.ex02;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(8);
        numeros.add(25);
        numeros.add(27);

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma es: " + suma);
    }
}