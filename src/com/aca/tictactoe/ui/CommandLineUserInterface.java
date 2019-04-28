package com.aca.tictactoe.ui;

import com.sun.glass.ui.Size;

import java.util.Scanner;

/**
 * I am not writing it all, but this class will in fact ask for user input.
 * Like get location, get name, get board size.
 */
public class CommandLineUserInterface extends UserInterface {
    Scanner scanner;

    @Override
    public boolean output(String message) {
        System.out.println(message);
        return true;
    }

    @Override
    public Size getSize() {
        //get size from scanner
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        return new Size(width, height);
    }
}
