package taller12_herencia_multiple;

public class Animal implements Volador, Nadador {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println("El animal de especie " + especie + " está volando por los aires.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal de especie " + especie + " está nadando en el agua.");
    }
}
