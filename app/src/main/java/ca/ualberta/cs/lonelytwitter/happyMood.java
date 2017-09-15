package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dwai on 9/14/17.
 */

public class happyMood extends currentMood{
    public happyMood(Date date) {
        super(date);
    }

    public happyMood() {
    }

    @Override
    public String toString() {
        return "happyMood{I am happy ecksdee}";
    }
}
