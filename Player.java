package com.qa.terrainGame;

import java.util.Scanner;

public class Player {

	int player_cord_x;

	private int player_cord_y;

	public static Scanner sc = new Scanner(System.in);

	public int getPlayer_cord_x() {
		return player_cord_x;
	}

	public void setPlayer_cord_x(int player_cord_x) {
		this.player_cord_x = player_cord_x;
	}

	public int getPlayer_cord_y() {
		return player_cord_y;
	}

	public void setPlayer_cord_y(int player_cord_y) {
		this.player_cord_y = player_cord_y;
	}

	public void start() {

		System.out.println("You are trapped in a large and dready swamp!");
		System.out.println("With you is a watch that tells you how far you are from the treasure");
		System.out.println("You are currently 10m away from the treasure");
		System.out.println("You have four different directions that you can go into: North, South, West and East");

	}

	public int north() {

		player_cord_y = player_cord_y + 1;
		System.out.println("Current distance: " + player_cord_x + "," + player_cord_y);
		System.out.println("Which direction next?");

		String choice = sc.nextLine();
		switch (choice.toLowerCase()) {
		case "north":
			north();
		case "south":
			south();
		case "west":
			west();
		case "east":
			east();
		}
		return player_cord_y;

	}

	public int south() {

		player_cord_y = player_cord_y - 1;
		System.out.println("Current distance: " + player_cord_x + "," + player_cord_y);
		System.out.println("Which direction next?");

		String choice = sc.nextLine();
		switch (choice.toLowerCase()) {
		case "north":
			north();
		case "south":
			south();
		case "west":
			west();
		case "east":
			east();
		}
		return player_cord_y;

	}

	public int west() {

		player_cord_x = player_cord_x - 1;
		System.out.println("Current distance: " + player_cord_x + "," + player_cord_y);
		System.out.println("Which direction next?");

		String choice = sc.nextLine();
		switch (choice.toLowerCase()) {
		case "north":
			north();
		case "south":
			south();
		case "west":
			west();
		case "east":
			east();
		}
		return player_cord_y;

	}

	public int east() {

		player_cord_x = player_cord_x + 1;
		System.out.println("Current distance: " + player_cord_x + "," + player_cord_y);
		System.out.println("Which direction next?");

		String choice = sc.nextLine();
		switch (choice.toLowerCase()) {
		case "north":
			north();
		case "south":
			south();
		case "west":
			west();
		case "east":
			east();
		}
		return player_cord_y;

	}
}
