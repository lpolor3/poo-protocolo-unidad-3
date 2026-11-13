package taller11_clases_abstractas;

public class PruebaUsoIncorrecto {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - USO INCORRECTO (T11)    ");
        System.out.println("==========================================");

        /*
         * 1. INTENTO DE INSTANCIAR UNA CLASE ABSTRACTA DIRECTAMENTE:
         * Si intentamos ejecutar la siguiente línea, el compilador de Java generará
         * un error inmediato: "Figura is abstract; cannot be instantiated"
         *
         * Descomenta la línea de abajo en tu IntelliJ para ver el error de compilación:
         */

        // Figura figuraInvalida = new Figura(); // ¡ERROR DE COMPILACIÓN!

        System.out.println("-> Las clases abstractas no pueden instanciarse con 'new'.");
        System.out.println("-> Sirven únicamente como plantillas o tipos base para polimorfismo.");
    }
}