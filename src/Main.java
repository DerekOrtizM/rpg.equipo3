import rpg.entities.Game;
import rpg.entities.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre del jugador
        System.out.print("Introduce el nombre del jugador: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // Iniciar el ciclo del juego
        Game game = new Game(player);
        game.startGame();
    }
}
