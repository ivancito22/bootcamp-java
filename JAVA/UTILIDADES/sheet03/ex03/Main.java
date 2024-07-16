
package UTILIDADES.sheet03.ex03;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> palabra = new LinkedList<String>();
    palabra.add("Hola");
    palabra.add("Mundo");
    palabra.add("Java");


    for (String pal : palabra) 

    System.out.println(pal);
  }
}