package com.coders.cricketmatch;
import java.util.Scanner;
public class CricketMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Team 1 Name: ");
        String team1 = sc.nextLine();

        System.out.print("Enter Team 1 Runs: ");
        int runs1 = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Team 2 Name: ");
        String team2 = sc.nextLine();

        System.out.print("Enter Team 2 Runs: ");
        int runs2 = sc.nextInt();

        if (runs1 > runs2) {
            System.out.println("\nWinner : " + team1);
            System.out.println("Won By : " + (runs1 - runs2) + " Runs");
        }
        else if (runs2 > runs1) {
            System.out.println("\nWinner : " + team2);
            System.out.println("Won By : " + (runs2 - runs1) + " Runs");
        }
        else {
            System.out.println("\nMatch Tied");
        }

        sc.close();
    }


	}


