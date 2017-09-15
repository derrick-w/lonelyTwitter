package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dwai on 9/14/17.
 */

public abstract class currentMood{

    private Date date;

    public currentMood(Date date) {
        this.date = date;
    }

    public currentMood() {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
