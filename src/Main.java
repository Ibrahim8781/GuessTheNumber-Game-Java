

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/*
            Ibrahim Ahmad
            07/08/2023

            Game, which allows a user to play "Guess the Number"
            game once. Game have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc. to get this task done!

 */
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public final long startTime;
    public long endTime;



    public int getNoOfGuesses() {
        return noOfGuesses;
    }


    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
        System.out.println("---------------------------------------------------------------");
        System.out.println("              Welcome to Our Number Guessing Game");
        System.out.println("---------------------------------------------------------------\n");

        System.out.println("Basic Rules For Game : \n");
        System.out.println("1. You have 10 tries to Guess the Number\n");
        System.out.println("2. The Number is always less than 100 \n");
        System.out.println("3. You will be told if your answer is LESS or GREATER than the Number \n");

        System.out.println("\n GOOD LUCK FOR THE GAME \n");
        startTime = System.currentTimeMillis();


    }


    void endGame() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("                            GAME OVER ");
        System.out.println("---------------------------------------------------------------\n");
    }
    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {

        noOfGuesses++;
        int difference = (inputNumber - number);

        if (inputNumber > 100 || inputNumber < 0 ) {
            System.out.println(" Invalid Input \n Number to be guessed is not Higher than 100 or Less than 0 ");
            return false;
        }
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was \" " + this.number + " \" ") ;
            System.out.println("You Guessed it in " + this.getNoOfGuesses() + " attempts ");
            endTime = System.currentTimeMillis();
            long timeTakenInSeconds = ( (endTime - startTime) /1000    );
            System.out.println("Time taken: " + timeTakenInSeconds + " seconds");
            System.exit(0);

            return true;
        }
        if (difference < 0) {

         if(difference>= -15) {
             System.out.println("Close but Your Guess is Low");
         }
         else{
             System.out.println("Your Guess is Too Low");
         }
        return false;
    }
        if (difference > 0) {

        if(difference <= 15){
            System.out.println("Close but Your Guess is High");
        }
        else {
            System.out.println("Close but Your Guess is High");
        }
        return false;
    }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {



        //TimeUnit.SECONDS.sleep(1);


        Game alpha = new Game();

        boolean counterForLoop = false;

        while(!counterForLoop){

            alpha.takeUserInput();
            alpha.isCorrectNumber();
            if (alpha.getNoOfGuesses() > 10) {
                System.out.println("You have used all of Your Guesses");
            }

            };

        alpha.endGame();


    }
}