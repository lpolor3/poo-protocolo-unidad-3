package taller11_clases_abstractas;

public class MainFigura {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - TALLER 11: CLASES ABSTRACTAS");
        System.out.println("==========================================");

        // Polimorfismo: Referencia de tipo Figura, pero instancia de Circulo y Rectangulo
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("\n--- Probando Círculo ---");
        miCirculo.mostrarArea();

        System.out.println("\n--- Probando Rectángulo ---");
        miRectangulo.mostrarArea();
    }
}