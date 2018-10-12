package com.qa.terrainGame;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {

		Player player1 = new Player();
		Treasure chest = new Treasure();

		player1.setPlayer_cord_x(0);
		player1.setPlayer_cord_y(0);
		chest.setTreasure_distance_x(1);
		chest.setTreasure_distance_y(1);

		player1.start();

		while ((player1.getPlayer_cord_x() & player1.getPlayer_cord_y()) != (chest.getTreasure_distance_x()
				& chest.getTreasure_distance_y())) {

			Scanner scan = new Scanner(System.in);
			String playchoice = scan.nextLine();

			switch (playchoice) {
			case "north":
				player1.north();
			case "south":
				player1.south();
			case "west":
				player1.west();
			case "east":
				player1.east();
			}
		}

	}
}
