package rpg.entities;

public class Dwarf extends Enemy {
    public Dwarf(String name, String rarity) {
        super(name, rarity);
    }

    @Override
    public String getGroupName() {
        return "Enano";
    }

    @Override
    public int getBaseHP() {
        return 90;  // Puntos de vida base para el enano
    }

    @Override
    public int getBaseAttack() {
        return 12;  // Puntos de ataque base para el enano
    }

    @Override
    public int getBaseDefense() {
        return 8;  // Puntos de defensa base para el enano
    }
}
