package sheet02.ex04;

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

// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    // Atributo adicional
    String grado;

    // Constructor
    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Grado: " + grado);
    }
}

// Clase Empleado que hereda de Persona
class Empleado extends Persona {
    // Atributo adicional
    double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Salario: $" + salario);
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear una lista de personas que incluye estudiantes y empleados
        Persona[] personas = {
                new Estudiante("Ana", 20, "Ingeniería"),
                new Empleado("Luis", 30, 50000),
                new Persona("Marta", 40)
        };

        // Recorrer el array para mostrar los detalles de los objetos y hacer uso del
        // polimorfismo
        for (Persona persona : personas) {
            persona.mostrarDetalles();
            System.out.println(); // Añadir una línea en blanco entre cada detalle de persona
        }
    }
}
