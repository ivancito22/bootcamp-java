package sheet02.ex03;

class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método get para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método set para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método get para la edad
    public int getEdad() {
        return edad;
    }

    // Método set para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    // Atributo adicional
    private String grado;

    // Constructor
    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad); // Llamada al constructor de la clase padre
        this.grado = grado;
    }

    // Sobrescribir mètodo
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamada al método de la clase padre
        System.out.println("Grado: " + grado);
    }

    // Método get para el grado
    public String getGrado() {
        return grado;
    }

    // Método set para el grado
    public void setGrado(String grado) {
        this.grado = grado;
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante llamando al constructor
        Estudiante estudiante = new Estudiante("Ana", 20, "Ingeniería");
        
        // Mostrar los detalles del estudiante
        estudiante.mostrarDetalles();
    }
}