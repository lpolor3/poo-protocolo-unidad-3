package taller13_interfaces_vs_abstractas;

public class PruebaErroresComparativa {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("   DEMOSTRACIÓN - USO INCORRECTO (TALLER 13)        ");
        System.out.println("====================================================");

        /*
         * 1. CLASE CONCRETA QUE IMPLEMENTA UNA INTERFAZ SIN IMPLEMENTAR SUS MÉTODOS:
         * Si definimos:
         *     class AvionIncompleto implements Volador { }
         * El compilador de Java detiene la construcción con el error:
         * "Java: AvionIncompleto is not abstract and does not override abstract method volar() in Volador"
         * Motivo: Todo contrato de interfaz exige una implementación concreta en la primera clase no abstracta de la jerarquía.
         *
         * 2. DEFINIR MÉTODOS PREDETERMINADOS ('default') EN UNA CLASE ABSTRACTA:
         * Si intentamos escribir dentro de una clase abstracta:
         *     abstract class EjemploAbstracto {
         *         default void metodoPredeterminado() { }
         *     }
         * El compilador arroja el error:
         * "Java: modifier default not allowed here" (o "extension methods are only allowed in interfaces").
         * Motivo: La palabra reservada 'default' en métodos fue introducida en Java 8 exclusivamente para permitir
         * evolución retrocompatible en INTERFACES. En una clase abstracta no tiene sentido ni es necesaria,
         * ya que una clase abstracta puede declarar métodos concretos (normales) directamente sin ningún modificador especial.
         */

        System.out.println("1. Omitir métodos de una interfaz en clase concreta -> Error de compilación obligatorio.");
        System.out.println("2. Usar modificador 'default' en clases abstractas -> Sintaxis inválida (exclusivo de interfaces).");
    }
}