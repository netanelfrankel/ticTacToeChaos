package com.tictactoe.game;

import com.tictactoe.players.Player;

public interface GameLogic {
    public void startGame();
    public boolean hasWinner();

    public void changePlayer();
    public Player getCurrentPlayer();
    public void displayBoard();
    public void playMove(int row, int col,char token);
}
