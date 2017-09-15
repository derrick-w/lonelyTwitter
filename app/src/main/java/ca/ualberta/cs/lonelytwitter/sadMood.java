package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dwai on 9/14/17.
 */

public class sadMood extends currentMood{
    public sadMood(Date date) {
        super(date);
    }

    public sadMood() {
    }

    @Override
    public String toString() {
        return "sadMood{I am sad UwU}";
    }
}
