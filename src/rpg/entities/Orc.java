package rpg.entities;

public class Orc extends Enemy {
    public Orc(String name, String rarity) {
        super(name, rarity);
    }

    @Override
    public String getGroupName() {
        return "Orco";
    }

    @Override
    public int getBaseHP() {
        return 100;  // Puntos de vida base para el orco
    }

    @Override
    public int getBaseAttack() {
        return 10;  // Puntos de ataque base para el orco
    }

    @Override
    public int getBaseDefense() {
        return 5;  // Puntos de defensa base para el orco
    }
}
