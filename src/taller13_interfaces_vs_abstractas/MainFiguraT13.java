package taller13_interfaces_vs_abstractas;

public class MainFiguraT13 {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - TALLER 13: FIGURAS (T13)      ");
        System.out.println("==========================================");

        Figura rectangulo = new Rectangulo(5.0, 3.0);
        Figura triangulo = new Triangulo(4.0, 6.0);

        System.out.println("\n--- Resultados de Áreas ---");
        System.out.println("Área del Rectángulo (Base: 5, Altura: 3): " + rectangulo.calcularArea());
        System.out.println("Área del Triángulo (Base: 4, Altura: 6): " + triangulo.calcularArea());
    }
}