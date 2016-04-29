package io.minlee;

import java.util.Random;

/**
 * Created by minlee on 4/28/16.
 */
public class Game {

    public  boolean gameOver;
    public  int secretNumber = this.setSecretNumber();


    public boolean runGameRound(int userInput)
    {
        boolean gameOver = this.getComparisonOfValues(userInput);
        return gameOver;

    }

    public boolean getComparisonOfValues(int userInput){
        //Checks if the user input equals the secret numbe
        if(userInput == secretNumber){
            System.out.println("Congratulations you finished the game!");
            return true;
        }
        else if(userInput > secretNumber){
            System.out.println("Your input is greater than the secret number");
            return false;
        }
        else{
            System.out.println("Your input is less than the secret number");
            return false;
        }
    }

    public int setSecretNumber(){
        //Generates a random secret number integer between 0 nad 100;
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        return secretNumber;
    }
    public int getSecretNumber(){
        //Generates a random secret number integer between 0 nad 100;
        return secretNumber;
    }
    public boolean checkIfConsecutiveInputsAreSame(int previousInput, int currentInput){
        //Checks to see if the current user input equals the previous att
        if(previousInput == currentInput){
            return true;
        }
        else{
            return false;
        }
    }

}
