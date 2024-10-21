package rpg.entities;

public class Ogre extends Enemy {
    public Ogre(String name, String rarity) {
        super(name, rarity);
    }

    @Override
    public String getGroupName() {
        return "Ogro";
    }

    @Override
    public int getBaseHP() {
        return 120;  // Puntos de vida base para el ogro
    }

    @Override
    public int getBaseAttack() {
        return 20;  // Puntos de ataque base para el ogro
    }

    @Override
    public int getBaseDefense() {
        return 0;  // Puntos de defensa base para el ogro
    }
}
