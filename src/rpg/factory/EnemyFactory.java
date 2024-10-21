package rpg.factory;

import rpg.entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyFactory {

    // Lista de tipos de enemigos
    private static List<Class<? extends Enemy>> enemyTypes = new ArrayList<>();

    static {
        // Añadimos los tipos de enemigos a la lista
        enemyTypes.add(Orc.class);
        enemyTypes.add(Goblin.class);
        enemyTypes.add(DarkElf.class);
        enemyTypes.add(Ogre.class);
        enemyTypes.add(Dwarf.class);
    }

    // Posibles rarezas de los enemigos
    private static String[] rarities = {"normal", "raro", "mágico", "ultramágico"};

    // Función para obtener un enemigo aleatorio
    public static Enemy getRandomEnemy() {
        Random rand = new Random();

        // Seleccionar un tipo de enemigo aleatorio
        int enemyIndex = rand.nextInt(enemyTypes.size());
        Class<? extends Enemy> enemyClass = enemyTypes.get(enemyIndex);

        // Seleccionar una rareza aleatoria
        String rarity = rarities[rand.nextInt(rarities.length)];

        try {
            // Crear una nueva instancia del enemigo seleccionado
            return enemyClass.getDeclaredConstructor(String.class, String.class)
                    .newInstance(enemyClass.getSimpleName(), rarity);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; // Retorna null si algo falla
    }
}
