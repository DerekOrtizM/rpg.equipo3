package rpg.items;

public class Armadura {
    private String nombre;
    private int defensa;

    // Constructor
    public Armadura(String nombre, int defensa) {
        this.nombre = nombre;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDefensa() {
        return defensa;
    }

    // Representación del objeto como cadena
    @Override
    public String toString() {
        return "Armadura: " + nombre + " (Defensa: " + defensa + ")";
    }
}
