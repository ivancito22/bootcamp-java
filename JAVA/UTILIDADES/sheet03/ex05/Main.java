package UTILIDADES.sheet03.ex05;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10);

        for (Integer numero : num) 
        
        System.out.println(numero);
      }
}
