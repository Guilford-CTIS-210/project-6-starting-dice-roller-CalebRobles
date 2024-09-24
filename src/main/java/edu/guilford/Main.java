package edu.guilford;
//CalebRobles
//9-23-24
import java.util.Random; 
//importing the random program
import java.util.Scanner; 
// importing the scanner program 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        //instantiates a scanner object renaming it "scan"
        System.out.println("This program rolls a number of dice and totals the rolls."); 
        //what the program will start off by saying when ran
        System.out.print("How many sides should the dice have? ");
        //what the system will print out to the user when program is ran
        int sides = scan.nextInt(); 
        //scans the number of sides the user inputs
        System.out.print("How many dice do you want to roll? ");
        //prints the question for the user to answer asking how many dice the user wants to roll
        int number = scan.nextInt(); 
        //scans the number of dice the user inputs
        Random rand = new Random(); 
        //instantiates a random object named "rand"
        int sum = 0; 
        //intial sum of 0 
        
        for (int i = 0; i < number; i++) {
            //starts the for loop
            int diceRoll = rand.nextInt(sides) + 1; 
            //rolls the dice and adds 1 to the sides
            sum += diceRoll; 
            //adds the roll to the sum
            System.out.println("Roll " + (i + 1) + ": " + diceRoll + " | Current Sum: " + sum);
            //prints the current roll and the current sum 
        }
    
        System.out.println("Rolling " + number + "d" + sides + " = " + sum);
        //prints the final results after the roll 
        scan.close();
        //closes the scanner 
    }
}