package UTILIDADES.sheet03.ex08;

public class Main {
    public static Integer divide(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (Integer) numerador / denominador;
    }

    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            Integer result = divide(numerador, denominador);
            System.out.println("El resultado de la división es: " + result);
        } catch (ArithmeticException error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
