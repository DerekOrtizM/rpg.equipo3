package rpg.entities;

public abstract class Enemy {
    private String name;
    private int healthPoints;
    private int attackPoints;
    private int defensePoints;
    private String rarity;  // Se asegura que la rareza esté presente

    // Constructor
    public Enemy(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;  // Asignamos la rareza
        this.healthPoints = getBaseHP();
        this.attackPoints = getBaseAttack();
        this.defensePoints = getBaseDefense();
    }

    // Métodos abstractos que las subclases deben implementar
    public abstract String getGroupName();
    public abstract int getBaseHP();
    public abstract int getBaseAttack();
    public abstract int getBaseDefense();

    // Métodos comunes
    public String getName() {
        return name;
    }

    public String getRarity() {  // Este es el método que faltaba
        return rarity;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void receiveDamage(int damage) {
        healthPoints -= Math.max(0, damage); // Asegura que el daño no sea negativo
        if (healthPoints < 0) {
            healthPoints = 0;
        }
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }

    public void attack(Player player) {
        int damage = attackPoints - player.getDefensePoints();
        if (damage > 0) {
            player.receiveDamage(damage);
        }
    }
}
