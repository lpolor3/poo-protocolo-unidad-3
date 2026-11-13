package taller11_clases_abstractas;

public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - EMPLEADOS (EJERCICIO 2 T11)");
        System.out.println("==========================================");

        Empleado emp1 = new Gerente("Carlos Mendoza", 3500000.0, 1200000.0);
        Empleado emp2 = new Vendedor("Ana Sofía Ruiz", 1800000.0, 650000.0);

        System.out.println("\n--- Detalles del Gerente ---");
        emp1.mostrarDetalles();

        System.out.println("\n--- Detalles del Vendedor ---");
        emp2.mostrarDetalles();
    }
}
