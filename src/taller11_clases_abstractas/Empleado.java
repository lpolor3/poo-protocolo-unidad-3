package taller11_clases_abstractas;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto que implementarán las subclases[cite: 8]
    public abstract double calcularSalario();

    // Método concreto que utiliza el método abstracto[cite: 8]
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Total Calculado: $" + calcularSalario());
    }
}