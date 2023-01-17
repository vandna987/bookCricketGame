package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.PlayerDetails;

public class PlayerDetailsTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for start the game and 0 for stop");
		int choice;
		choice = sc.nextInt();
		PlayerDetails obj = new PlayerDetails();
		while(choice==1)
		{
			obj.pl=1;
			obj.executeGame();
			System.out.println("----------------------------------");
			System.out.println("Enter 1 for start the game and 0 for stop");
			choice = sc.nextInt();
			
		}
	}

}
