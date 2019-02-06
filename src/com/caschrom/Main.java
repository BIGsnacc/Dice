/*  1.  Get info
        1.1. Get number of dice
        1.2. Get number of sides
    2.  Do calculations
        2.1. Roll user dice and store result
        2.2. Roll computer dice and store result
        2.3. Compare user roll to computer roll
    3.  Print results
        3.1. Print user roll score
        3.2. Print computer roll score
        3.3. Say if user tied
        3.4. Say if user won
        3.5. Say if user lost






*/
package com.caschrom;
import java.util.Scanner;


public class Main {


     public static void main(String[] args)  //example of how to use the Dice class
     {
         Scanner keyboard = new Scanner(System.in);

         int myScore;

         int computerScore;

         System.out.println ("Welcome to the annual dice rolling game!");
         System.out.println ("You will compete for the highest score from a roll against the computer.");
         System.out.println ("If you score higher, you win! If you score lower, you lose. If you tie, nobody wins.");
         System.out.println (" ");

         //Get inputs from user
         System.out.println("Enter the number of dice you want.");
         int numberOfDice = keyboard.nextInt();
         System.out.println("Enter the number of sides you want on your dice.");
         int numberOfSides = keyboard.nextInt();





         Dice mydice = new Dice(numberOfDice, numberOfSides);  //creates a set of dice based on user's input

         //Storing and printing results for rollDice for user and computer
         myScore = mydice.rollDice();
         System.out.println ("Your score is " + myScore);

         computerScore = mydice.rollDice();
         System.out.println ("The computer's score is " + computerScore);

         //Comparing results and declaring winner
         if (myScore == computerScore)
         {
             System.out.println ("You tied.");
         }

            else if (myScore > computerScore)
         {
             System.out.println ("Congratulations! You won!");
         }

            else if (myScore < computerScore)
         {
             System.out.println ("Bummer dude! You lost!");
         }


     }
 }





 /*Assignment:  In a separate file, write a program that allows the user to play a simple dice game.
 *You should not modify the Dice class at all!  You will need to create a project and add this file
  to your project in order to be able to use the dice class.
 *Your program should do the following:
 *
 *Ask the user how many dice to use and how many sides they have.
 *
 *Roll the dice twice- once for the user, once for the computer.
 *
 *If the user's roll is higher, he wins, otherwise the computer wins.
 *
 *Extra credit:  Allow the program to repeat (By using a loop- don't retype or copy the program.
 *
 *Good Luck!! Yes- pseudocode and comments are required!!!
 **/




