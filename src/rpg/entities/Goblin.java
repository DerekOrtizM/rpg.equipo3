package rpg.entities;

public class Goblin extends Enemy {
    public Goblin(String name, String rarity) {
        super(name, rarity);
    }

    @Override
    public String getGroupName() {
        return "Goblin";
    }

    @Override
    public int getBaseHP() {
        return 80;  // Puntos de vida base para el goblin
    }

    @Override
    public int getBaseAttack() {
        return 7;  // Puntos de ataque base para el goblin
    }

    @Override
    public int getBaseDefense() {
        return 10;  // Puntos de defensa base para el goblin
    }
}
