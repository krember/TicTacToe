package com.aca.tictactoe;

import com.aca.tictactoe.engine.GameEngine;
import com.aca.tictactoe.engine.GameStatus;
import com.aca.tictactoe.ui.CommandLineUserInterface;
import com.aca.tictactoe.ui.GraphicalUserInterface;
import com.aca.tictactoe.ui.UserInterface;
import com.sun.glass.ui.Size;

public class TicTacToe {
    private UserInterface userInterface;
    private GameEngine gameEngine;

    public TicTacToe(GameType gameType) {
        switch (gameType) {
            case COMMAND_LINE:
                userInterface = new CommandLineUserInterface();
                break;
            case GRAPHICAL_UI:
                userInterface = new GraphicalUserInterface();
                break;
        }
        gameEngine = null;
    }

    /**
     * Start the game.
     */
    public void start() {
        initialize();

        GameStatus status = gameLoop();
        switch (status) {
            case FINISHED:
                userInterface.output("The winner is:" + gameEngine.getWinner().getValue().name);
        }
    }

    /**
     * Starts the main game loop.
     *
     * @return status of the game.
     */
    private GameStatus gameLoop() {
        while(gameEngine.isGameFinished()) {
            // Game loop
            makeMove();
        }

        return GameStatus.FINISHED;
    }

    private void makeMove() {
    }

    /**
     * Initialize game based on user input.
     */
    private void initialize() {
        //Example: Get size
        userInterface.output("Please enter board size");

        Size size = userInterface.getSize();
    }
}
