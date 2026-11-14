package taller13_interfaces_vs_abstractas;

public class MainPato {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - INTERFACES EN PATO (T13)      ");
        System.out.println("==========================================");

        Pato pato = new Pato("Donald");

        System.out.println("\n--- Ejecutando habilidades ---");
        pato.volar();
        pato.nadar();
    }
}