package taller12_herencia_multiple;

public class PruebaErrorInterfaces {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - ERROR EN INTERFACES (T12)");
        System.out.println("==========================================");

        /*
         * 1. INTENTO DE IMPLEMENTAR UNA INTERFAZ SIN SOBREESCRIBIR SUS MÉTODOS:
         * Si creamos una clase normal (no abstracta) que use 'implements Volador'
         * pero omitimos el método 'volar()', el compilador de Java arroja el error:
         * "Java: ClaseInvalida is not abstract and does not override abstract method volar() in Volador"
         *
         * 2. MALA PRÁCTICA DE IMPLEMENTAR INTERFACES SIN LÓGICA RELEVANTE:
         * Por ejemplo, hacer que una clase 'Casa' implemente 'Nadador'. Aunque técnicamente
         * compile si se añade un método vacío, viola el principio de diseño de interfaces
         * (Interface Segregation Principle), ya que una casa no nada, corrompiendo la semántica
         * y legibilidad del código.
         */

        System.out.println("-> Las clases concretas están obligadas a implementar todos los métodos de sus interfaces.");
        System.out.println("-> Las interfaces deben reflejar contratos reales y cohesivos para evitar malas prácticas.");
    }
}