package com.aca.tictactoe.ui;

import com.sun.glass.ui.Size;

/**
 * I am not writing it all, but this interface will have methods for getting input from user.
 * and sending info to user
 * Like get location, get name, get board size.
 */
public abstract class UserInterface {

    /**
     * Send info to user.
     *
     * @param message the message
     * @return true if success.
     */
    public abstract boolean output(String message);

    /**
     * Get size from user.
     *
     * @return the size;
     */
    public abstract Size getSize();
}
