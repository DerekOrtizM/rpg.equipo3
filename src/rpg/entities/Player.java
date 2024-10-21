package rpg.entities;

public class Player {
    private String name;
    private int healthPoints;
    private int attackPoints;
    private int defensePoints;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.attackPoints = 20;
        this.defensePoints = 10;
    }

    public String getName() {
        return name;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void receiveDamage(int damage) {
        healthPoints -= Math.max(0, damage);
        if (healthPoints < 0) {
            healthPoints = 0;
        }
        System.out.println(name + " recibe " + damage + " puntos de daño. Vida restante: " + healthPoints);
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }

    public void attack(Enemy enemy) {
        int damage = attackPoints - enemy.getDefensePoints();
        if (damage > 0) {
            enemy.receiveDamage(damage);
            System.out.println(name + " inflige " + damage + " puntos de daño a " + enemy.getName());
        }
    }
}
