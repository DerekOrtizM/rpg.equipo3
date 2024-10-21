package rpg.items;

public class Miscelánea {
    private String tipo;
    private String efecto;

    // Constructor
    public Miscelánea(String tipo, String efecto) {
        this.tipo = tipo;
        this.efecto = efecto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEfecto() {
        return efecto;
    }

    // Representación del objeto como cadena
    @Override
    public String toString() {
        return "Miscelánea: " + tipo + " (Efecto: " + efecto + ")";
    }
}
