package sheet02.ex02;

// Clase Persona
class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Antes, el nombre de la persona era " + nombre + " y la edad, " + edad + " años.");
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

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Llamada al constructor
        Persona persona = new Persona("Juan", 25);
        
        // Mostrar los detalles
        persona.mostrarDetalles();
        
        // Modificar los set
        persona.setNombre("Carlos");
        persona.setEdad(30);
        
        // Obtener y mostrar los valores modificados de los atributos usando los métodos get
        System.out.println("Ahora el nombre es " + persona.getNombre() + " y la edad es de " + persona.getEdad()+ " años.");
    }
}

