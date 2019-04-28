package com.aca;

import com.aca.tictactoe.GameType;
import com.aca.tictactoe.TicTacToe;

public class Main {

    public static void main(String[] args) {
        // Create game with given interface type
        TicTacToe ticTacToe = new TicTacToe(GameType.COMMAND_LINE);

        // Start the game
        ticTacToe.start();
    }
}
