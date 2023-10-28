package com.tictactoe.game;

import com.tictactoe.players.Player;

import java.util.ArrayList;
import java.util.Collections;

public class TicTacToe implements GameLogic {

    private ArrayList<ArrayList <Character>> board;
    Player playerOne;
    Player playerTwo;

    Player currentPlayer;

    public TicTacToe(Player playerOne, Player playerTwo){
        this.currentPlayer = playerOne;

        this.playerOne = playerOne;
        this.playerOne.setToken('X');

        this.playerTwo = playerTwo;
        this.playerTwo.setToken('O');

        board = new ArrayList<ArrayList <Character>>();
        for(int i =0; i< 3 ; i++){
            board.add(new ArrayList<>(Collections.nCopies(3,'E')));
        }
    }
    @Override
    public boolean hasWinner() {
        return false;
    }

    @Override
    public void startGame() {

    }

    @Override
    public void changePlayer() {

    }

    @Override
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    @Override
    public void displayBoard() {
        ArrayList<ArrayList <Character>> board = getBoard();
        for(ArrayList<Character> row : board){
            for(Character tile: row ){
                System.out.print(tile);
            }
            System.out.println();
        }
    }

    @Override
    public void playMove(int row, int col, char token) {
        board.get(row).set(col,token);
    }

    public ArrayList<ArrayList<Character>> getBoard() {
        return board;
    }
}
