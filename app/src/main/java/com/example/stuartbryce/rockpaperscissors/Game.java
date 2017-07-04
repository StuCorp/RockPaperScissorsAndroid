package com.example.stuartbryce.rockpaperscissors;

import java.util.concurrent.CompletionService;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Game {


    private Player player;
    protected Computer computer;

    public Game(){
        player = new Player();
        computer = new Computer();
    }

//    public void playGame(){
//        Move computerMove = computer.getMove();
//        Move playerMove = player.getMove();
//        System.out.println("You played " + playerMove.getType());
//        System.out.println("Computerplayed " + computerMove.getType());
//        int winner = compareMoves(playerMove, computerMove);
//        displayWinner(winner);
//    }

    protected int compareMoves(String playerMove, String computerMove){
        if (playerMove.equals(computerMove)){
            return 0;
        }
        switch(playerMove){
            case "rock" :
                return (computerMove.equals("scissors") ? 1 : -1);
            case "paper" :
                return (computerMove.equals("rock") ? 1 : -1);
            case "scissors" :
                return (computerMove.equals("paper") ? 1 : -1);
            default:
                return 0;
        }
    }


    protected String displayWinner(int result){
        switch(result){
            case 0:
                return "DRAW GAME!";
            case 1:
                return "YOU WIN!";
            case -1:
                return "YOU LOSE!";
            default :
                return "game broken";
        }
    }
}
