/*
 * Class Name: Tweetable
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM SSMAD, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Displays Tweets
 * @author dwai
 * @version 1.0
 * @since 1.0
 * @see Tweet
 *
 */
public interface Tweetable {
    String getMessage();
    Date getDate();
}
