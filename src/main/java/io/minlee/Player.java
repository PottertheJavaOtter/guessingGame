package io.minlee;

import java.util.Scanner;
/**
 * Created by minlee on 4/28/16.
 */
public class Player {

    public int nonConsectutiveAttemptCounter = 0;
    public int previousInput = -1;
    boolean donePlayingGame = false;


    public void play(){
      System.out.println("Playing Game");
      Game game = new Game();
      System.out.println(game.getSecretNumber());
      //While runs until donePlayingGame = true
      while(donePlayingGame != true) {
           int currentInput = makeInput();
           if(currentInput == previousInput){
                System.out.println("Number of attempts is still "+nonConsectutiveAttemptCounter);
               continue;
           }
           else {
               donePlayingGame = game.runGameRound(currentInput);
               nonConsectutiveAttemptCounter++;
           }
           System.out.println("Number of attempts is "+nonConsectutiveAttemptCounter);
           previousInput = currentInput;
      }
    }

    public int makeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");
        return input.nextInt();
    }
      public static void main(String[] args) {
          Player player = new Player();
          player.play();


      }
}








