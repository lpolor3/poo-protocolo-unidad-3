package taller12_herencia_multiple;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está comunicando ideas en la reunión del equipo.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está desarrollando software en Java.");
    }
}