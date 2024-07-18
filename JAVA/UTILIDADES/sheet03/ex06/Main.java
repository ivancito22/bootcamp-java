package UTILIDADES.sheet03.ex06;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    numbers.add(25);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i % 2 != 0) {
        it.remove();
      }
    }
    System.out.println("Lista después de eliminar impares: " + numbers);
  }
}
