package com.monocept.model;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PlayerDetails {
	int totalAttempt;
	int score1=0;
	Scanner sc = new Scanner(System.in);
	public int pl=0;
	public void executeGame() {
		System.out.println("Enter player 1 name");
		//sc.nextLine();
		String player1 = sc.nextLine();
		System.out.println("Enter player 2 name");
		String player2 = sc.nextLine();
		System.out.println("player "+player1);
		score1 = playGame();
		int attempt1 = totalAttempt;
		System.out.println((player1+" total score "+score1));
		System.out.println(player1+" takes "+attempt1+" rounds");
		int sc=score1+1; int atmp=attempt1+1;
		System.out.println(player2+" needs "+sc+" score in "+atmp+" rounds");
		pl++;
		System.out.println("player "+player2);
		int score2 = playGame();
		int attempt2 =totalAttempt;
		if(score1>score2) System.out.println(player1+" win the match!!!");
		if(score1<score2) System.out.println(player2+" win the match!!!");
		if(score1==score2) 
		{
			if(attempt1>attempt2) System.out.println(player2+" win the match!!!");
			if(attempt1<attempt2) System.out.println(player1+" win the match!!!");
		}
	}

	 private int playGame() {
		int point =0;
		int score =0;
		int pageNo ;
		int attempt=0;
		
		do
		{
			attempt++;
			System.out.println("Enter 1 to open book");
			int choice =sc.nextInt();
			if(choice==1)
			{
				pageNo = ThreadLocalRandom.current().nextInt(1,300);
				point = pageNo%7;
				score += point;
				System.out.println("page no. "+pageNo+
						"             point:- "+point+
						"             score:- "+score);
			}
			if(pl==2 && score>score1) break; 
		}while(point>0);
		totalAttempt=attempt;
		return score;
	}

	
	
}
