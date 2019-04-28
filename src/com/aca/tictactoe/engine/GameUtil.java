package com.aca.tictactoe.engine;

import com.aca.tictactoe.engine.models.Board;
import com.aca.tictactoe.engine.models.Player;
import com.aca.tictactoe.engine.models.PlayerType;

/**
 * Utility class for the game.
 */
abstract class GameUtil {

    /**
     * Checks whether someone won the game.
     *
     * @param board the board
     * @return PlayerType instance indicating the winner.
     */
    static PlayerType checkWin(Board board) {
        PlayerType winner;
        winner = checkWinVertically(board);
        if(winner != PlayerType.NONE) {
            return winner;
        }
        winner = checkWinDiagonally(board);
        if(winner != PlayerType.NONE) {
            return winner;
        }
        winner = checkWinBackDiagonally(board);
        if(winner != PlayerType.NONE) {
            return winner;
        }
        winner = checkWinHorizontally(board);
        if(winner != PlayerType.NONE) {
            return winner;
        }
        return PlayerType.NONE;
    }

    /**
     * Checks whether someone won the game horizontally.
     *
     * @param board the board
     * @return PlayerType instance indicating the winner.
     */
    static PlayerType checkWinHorizontally(Board board) {
        return PlayerType.NONE;
    }

    /**
     * Checks whether someone won the game vertically.
     *
     * @param board the board
     * @return PlayerType instance indicating the winner.
     */
    static PlayerType checkWinVertically(Board board) {
        return PlayerType.NONE;
    }

    /**
     * Checks whether someone won the game diagonally.
     *
     * @param board the board
     * @return PlayerType instance indicating the winner.
     */
    static PlayerType checkWinDiagonally(Board board) {
        return PlayerType.NONE;
    }

    /**
     * Checks whether someone won the game back diagonally.
     *
     * @param board the board
     * @return PlayerType instance indicating the winner.
     */
    static PlayerType checkWinBackDiagonally(Board board) {
        return PlayerType.NONE;
    }
}
