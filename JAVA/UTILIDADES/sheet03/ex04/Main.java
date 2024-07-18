package UTILIDADES.sheet03.ex04;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();


    // Add keys and values (Name, Age)
    people.put("Juan", 30);
    people.put("Ana", 25);
    people.put("Luis", 35);

    for (String i : people.keySet()) {
      System.out.println(i + " tiene " + people.get(i) + " años.");
    }
  }
}