package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


	// write your code
        static Scanner input = new Scanner(System.in);
        static Random rand = new Random(10);
        static int trials;
        static int maxTrials = 3;
        static final int MIN_NUM = 1;
        static final int MAX_NUM = 10;
        static final int MIN_CREDIT = 1;
        static final int MAX_CREDIT = 10;

    public static void main(String[] args) {
        String choice;
        do {
            System.out.println("Do you want to play the game? (answer with yes/no)");
            choice = input.next().toLowerCase();

            if (choice.equals("yes")) {
                playGame();
            } else if (choice.equals("no")) {
                System.out.println("Please come back next time");
            } else {
                System.out.println("Enter valid choice\n");
            }

        } while(!choice.equals("yes") && !choice.equals("no"));
    }

    private static void playGame() {
        int randNum = rand.nextInt(MAX_NUM - MIN_NUM + 1) + MIN_NUM;
        int num;
        String choice;
        do {
            do {
                System.out.println("Please enter number between " + MIN_NUM + "-" + MAX_NUM);
                num = input.nextInt();
                if (num >= MIN_NUM && num <= MAX_NUM) {
                    if (isWon(randNum, num)) {
                        System.out.println("Congratulations!!! You Won the game");
                    } else {
                        System.out.println("You Loss the game ");
                    }
                    trials++;
                    if(trials == 3) {
                        System.out.println("You completed the trial version, Do you want to enter the credit?");
                        choice = input.next().toLowerCase();
                        if (choice.equals("yes")) {
                            playGame();
                        } else if (choice.equals("no")) {
                            System.out.println("Please come back next time");
                            break;
                        } else {
                            System.out.println("Enter valid choice\n");
                        }
                    }
                } else {
                    System.out.println("Sorry, your number is out of the range");
                }
            } while (num < MIN_NUM && num > MAX_NUM);
        } while (trials < maxTrials);
    }

    private static boolean isWon(int randNum, int num) {
        if(randNum == num) {
            return true;
        }
        else {
            return false;
        }
    }
}

