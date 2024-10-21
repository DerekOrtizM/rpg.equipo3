package rpg.entities;

import rpg.factory.EnemyFactory;
import rpg.items.*;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;
    private Inventario inventario;

    // Constructor
    public Game(Player player) {
        this.player = player;
        this.inventario = new Inventario();  // El jugador comienza con un inventario vacío
    }

    // Método para iniciar el ciclo de combate
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean continuePlaying = true;
        Random random = new Random();

        while (continuePlaying) {
            // Inicia un ciclo de 4 combates
            for (int i = 1; i <= 4; i++) {
                if (!player.isAlive()) {
                    System.out.println("El jugador ha muerto. Fin del juego.");
                    return;
                }

                Enemy enemy = EnemyFactory.getRandomEnemy();
                System.out.println("\n--- COMBATE " + i + " ---");
                System.out.println(player.getName() + " se enfrenta a " + enemy.getName() + " de rareza " + enemy.getRarity());

                // Realizar el combate
                while (player.isAlive() && enemy.isAlive()) {
                    player.attack(enemy);
                    if (enemy.isAlive()) {
                        enemy.attack(player);
                    }
                }

                // Resultado del combate
                if (!enemy.isAlive()) {
                    System.out.println("¡" + player.getName() + " ha derrotado a " + enemy.getName() + "!");
                    // Drop aleatorio después de la victoria
                    Object objetoDroopeado = dropearObjeto(random);
                    inventario.añadirObjeto(objetoDroopeado);
                    System.out.println("El enemigo ha soltado: " + objetoDroopeado.toString());
                } else {
                    System.out.println("¡" + enemy.getName() + " ha derrotado a " + player.getName() + "!");
                    return;  // Termina el juego si el jugador muere
                }
            }

            // Mostrar el inventario después de cada ciclo de 4 combates
            inventario.mostrarInventario();

            // Preguntar si el jugador quiere seguir jugando después de 4 combates
            System.out.print("¿Deseas seguir jugando? (1.sí 2.no): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equals("1")) {
                continuePlaying = false;
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
            }
        }
    }

    // Método para dropear un objeto aleatorio
    private Object dropearObjeto(Random random) {
        int tipoObjeto = random.nextInt(3);  // Genera un número aleatorio entre 0 y 2
        switch (tipoObjeto) {
            case 0:
                return new Armadura("Armadura de hierro", 15);
            case 1:
                return new Armas("Espada de fuego", 25);
            case 2:
                return new Miscelánea("Poción de curación", "Recupera 50 puntos de vida");
            default:
                return null;
        }
    }
}
