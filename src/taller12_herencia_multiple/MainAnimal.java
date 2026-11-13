package taller12_herencia_multiple;

public class MainAnimal {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - ANIMAL MULTIFUNCIONAL (T12)   ");
        System.out.println("==========================================");

        Animal pato = new Animal("Pato silvestre");

        System.out.println("\n--- Comportamientos del Animal ---");
        pato.volar();
        pato.nadar();
    }
}