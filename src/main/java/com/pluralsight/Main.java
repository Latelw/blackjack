package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Player 1, enter your name: ");
        Scanner scanner = new Scanner(System.in);
        //Create the hands that are going to be used
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        Hand player3 = new Hand();
        //Set name of players as you prompt for them
        //Welcome Players to the games
        player1.setName(scanner.nextLine());
        System.out.println("Welcome, " + player1.getName());

        System.out.println("Player 2, enter your name: ");
        player2.setName(scanner.nextLine());
        System.out.println("Welcome, " + player2.getName());


        System.out.println("Player 3, enter your name: ");
        player3.setName(scanner.nextLine());
        System.out.println("Welcome, " + player3.getName());

        //Create deck and shuffle
        Deck mainDeck = new Deck();
        mainDeck.shuffle();

        //Every hand has 2 cards
        player1.deal(mainDeck.deal());
        player1.deal(mainDeck.deal());
        player2.deal(mainDeck.deal());
        player2.deal(mainDeck.deal());
        player3.deal(mainDeck.deal());
        player3.deal(mainDeck.deal());

        //Print each hands value
        System.out.println(player1.getName() + "'s hand: ");
        System.out.println(player1.getValue());

        System.out.println(player2.getName() + "'s hand: ");
        System.out.println(player2.getValue());

        System.out.println(player3.getName() + "'s hand: ");
        System.out.println(player3.getValue());
        //Name a winner Score = less than or equal to 21

        if (player1.getValue() <= 21 && player1.getValue() > player2.getValue()
                && player1.getValue() > player3.getValue()){
                System.out.println(player1.getName() +" is the winner!");


        } else if (player2.getValue() <= 21 && player2.getValue() > player1.getValue()
                && player2.getValue() > player3.getValue()) {
                System.out.println(player2.getName() + " is the winner!");

        } else if (player3.getValue() <= 21 && player3.getValue() > player1.getValue()
                && player3.getValue() > player2.getValue()) {
                System.out.println(player3.getName() + " is the winner!");

        } else {
            System.out.println("There was a tie");
        }



    }
}
