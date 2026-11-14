package taller13_interfaces_vs_abstractas;

public class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println("El pato " + nombre + " extiende sus alas y emprende el vuelo.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato " + nombre + " nada tranquilamente en el lago.");
    }
}