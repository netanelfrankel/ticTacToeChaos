package com.tictactoe;


import com.tictactoe.game.TicTacToe;
import com.tictactoe.players.Player;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("XxfiservxX");
        Player playerTwo = new Player("Orange");
        TicTacToe test = new TicTacToe(playerOne,playerTwo);
        test.displayBoard();
    }
}
