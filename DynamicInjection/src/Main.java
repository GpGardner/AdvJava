import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main Method - runs program
 */

public class Main {
	public static void main(String[] args) {
		IEnemy enemy = null;

		Scanner scanner = new Scanner(System.in);
		boolean playGame = true;

		while (playGame) {

			System.out.println("Welcome to the game, would you like to add an enemy? 1 - yes, 2 - no");
			if (scanner.nextInt() == 1) {
				System.out.println("What type of enemy? 1 - big enemy, 2 - small enemy");
				Integer answer = scanner.nextInt();

				if (answer == 1) {

					enemy = new BigEnemy("BigEnemy", 50, "BIG ROAR");

				}

				if (answer == 2) {

					enemy = new LittleEnemy("LittleEnemy", 15, "little roar");
					
				}
				
				System.out.println(enemy.toString());
				enemy.speak();

			}else{
				playGame = false;
			}

		}
		scanner.close();

	}

}
