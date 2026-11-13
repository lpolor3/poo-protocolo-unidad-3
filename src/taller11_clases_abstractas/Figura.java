package taller11_clases_abstractas;

// Clase abstracta base
public abstract class Figura {

    // Método abstracto (sin cuerpo, las subclases están obligadas a implementarlo)[cite: 8]
    public abstract double calcularArea();

    // Método concreto en la clase abstracta que utiliza el método abstracto[cite: 8]
    public void mostrarArea() {
        System.out.println("El área calculada de la figura es: " + calcularArea());
    }
}
