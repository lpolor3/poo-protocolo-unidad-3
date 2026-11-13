package taller12_herencia_multiple;

public class MainPersona {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - TALLER 12: HERENCIA MÚLTIPLE  ");
        System.out.println("==========================================");

        Persona persona = new Persona("Luis");

        System.out.println("\n--- Ejecutando comportamientos ---");
        persona.hablar();
        persona.trabajar();
    }
}