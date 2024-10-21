package rpg.items;

public class Armas {
    private String nombre;
    private int ataque;

    // Constructor
    public Armas(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    // Representación del objeto como cadena
    @Override
    public String toString() {
        return "Arma: " + nombre + " (Ataque: " + ataque + ")";
    }
}
