package rpg.items;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Object> items;

    // Constructor
    public Inventario() {
        this.items = new ArrayList<>();
    }

    // Añadir objeto al inventario
    public void añadirObjeto(Object item) {
        items.add(item);
        System.out.println("Has añadido un nuevo objeto al inventario: " + item.toString());
    }

    // Mostrar el inventario
    public void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        if (items.isEmpty()) {
            System.out.println("Tu inventario está vacío.");
        } else {
            for (Object item : items) {
                System.out.println("- " + item.toString());
            }
        }
        System.out.println("------------------\n");
    }
}
