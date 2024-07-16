
package sheet02.ex01;

class Persona {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre de la persona: " + nombre);
        System.out.println("Edad: " + edad + " años.");
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Llamada al constructor
        Persona persona = new Persona("Juan", 25);
        
        // Mostrar los detalles
        persona.mostrarDetalles();
    }
}