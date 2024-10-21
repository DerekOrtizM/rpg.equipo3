package rpg.entities;

public class DarkElf extends Enemy {
    public DarkElf(String name, String rarity) {
        super(name, rarity);
    }

    @Override
    public String getGroupName() {
        return "Elfo Oscuro";
    }

    @Override
    public int getBaseHP() {
        return 60;  // Puntos de vida base para el elfo oscuro
    }

    @Override
    public int getBaseAttack() {
        return 17;  // Puntos de ataque base para el elfo oscuro
    }

    @Override
    public int getBaseDefense() {
        return 7;  // Puntos de defensa base para el elfo oscuro
    }
}
