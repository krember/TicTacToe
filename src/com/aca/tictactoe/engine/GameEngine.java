package com.aca.tictactoe.engine;

import com.aca.tictactoe.engine.models.Board;
import com.aca.tictactoe.engine.models.GameRules;
import com.aca.tictactoe.engine.models.Player;
import com.aca.tictactoe.engine.models.PlayerType;
import javafx.util.Pair;

import java.awt.*;
import java.util.Map;

/**
 * The business logic of the game.
 */
public class GameEngine {
    private Board board;
    private GameRules gameRules;
    private PlayerType winner;
    private GameStatus gameStatus;
//    private Player xPlayer;
//    private Player oPlayer;
    private Map<PlayerType, Player> players; // You could use 2 fields instead of map.

    /**
     * Creates new game.
     *
     * @param gameRules the rules of the game
     * @param xPlayer player object for X mark
     * @param oPlayer player object for O mark
     */
    public GameEngine(GameRules gameRules, Player xPlayer, Player oPlayer) throws IllegalArgumentException {
        // Only initialize with given argument.

        gameStatus = GameStatus.IN_PROGRESS;
        winner = PlayerType.NONE;
    }

    /**
     * Makes the move for the player.
     *
     * @param player player that makes the move
     * @param location the location of the mark
     * @return game status after the move
     */
    public GameStatus makeMove(PlayerType player, Point location) throws IllegalArgumentException {
        // Make move

        PlayerType winner = GameUtil.checkWin(board);
        if(winner != PlayerType.NONE) {
            this.winner = winner;
            gameStatus = GameStatus.FINISHED;
        } else {
            gameStatus = GameStatus.IN_PROGRESS;
        }
        return gameStatus;
    }

    /**
     * Whether the game is finished.
     *
     * @return true if finished, false otherwise
     */
    public boolean isGameFinished() {
        return gameStatus != GameStatus.IN_PROGRESS;
    }

    public Pair<PlayerType, Player> getWinner() {
        return new Pair<>(winner, players.get(winner));
    }

    /**
     * New games with the same rule.
     */
    public void newGame() {

    }

    /**
     * New games with new rules.
     *
     * @param gameRules the rules of the game
     * @param xPlayer player object for X mark
     * @param oPlayer player object for O mark
     */
    public void newGame(GameRules gameRules, Player xPlayer, Player oPlayer) throws IllegalArgumentException {

    }
}
