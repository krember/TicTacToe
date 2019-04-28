package com.aca.tictactoe.ui;

import com.sun.glass.ui.Size;

import java.util.Scanner;

public class GraphicalUserInterface extends UserInterface {

    @Override
    public boolean output(String message) {
        // Show pop-up
        return true;
    }

    @Override
    public Size getSize() {
        //get size from GUI
        return null;
    }
}
