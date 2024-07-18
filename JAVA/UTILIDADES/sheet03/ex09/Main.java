package UTILIDADES.sheet03.ex09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email = "tes4saafa@example3.com";

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern patron = Pattern.compile(regex);
        Matcher marcador = patron.matcher(email);

        boolean matchFound = marcador.find();

        if (matchFound) {
            System.out.println(email + " es un correo válido.");
        } else {
            System.out.println(email + " no es un correo válido.");
        }
    }
}
