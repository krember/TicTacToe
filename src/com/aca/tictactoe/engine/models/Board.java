package com.aca.tictactoe.engine.models;

import com.sun.glass.ui.Size;

import java.awt.*;
import java.util.Vector;

public class Board {
    /**
     * This is the plain presentation of the board
     */
    private Vector<Vector<BoardTile>> matrix;  // Could also be BoardTile[][]
    private Size size;

    /**
     * Creates empty board.
     *
     * @param width the width
     * @param height the height
     */
    public Board(Integer width, Integer height) throws IllegalArgumentException {

    }

    /**
     * Creates empty board.
     *
     * @param size the size
     */
    public Board(Size size) throws IllegalArgumentException {
    }

    /**
     * Mostly for testing.
     *
     * @param board the plain board.
     */
    Board(Vector<Vector<BoardTile>> board) throws IllegalArgumentException {

    }

    /**
     * @param location the location of the tile (the horizontal location and the vertical location)
     * @return the tile info at the given location
     */
    public BoardTile getAt(Point location) throws IllegalArgumentException{
        return matrix.elementAt(location.x).elementAt(location.y);
    }

    /**
     * Sets the tile at the given location.
     *
     * @param location the location
     * @param newTile the new tile
     */
    public void set(Point location, BoardTile newTile) throws IllegalArgumentException {

    }

    /**
     * Sets the tile at the given location if its not empty.
     *
     * @param location the location
     * @param newTile the new tile
     * @return true if was empty, false otherwise
     */
    public boolean setIfEmpty(Point location, BoardTile newTile) throws IllegalArgumentException {
        return  false;
    }

    /**
     * Checks whether the given tile is empty.
     *
     * @param location the location
     * @return true if empty, false if not
     */
    public boolean isEmpty(Point location) {
        return false;
    }

    public Size getSize() {
        return size;
    }
}
