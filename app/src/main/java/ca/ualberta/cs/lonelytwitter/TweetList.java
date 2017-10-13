package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by dwai on 10/12/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private ArrayList<Tweet> tweetsTest = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet){
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException("Tweet already exists");
        }else{
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        tweetsTest = tweets;
        Collections.sort(tweetsTest, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
                return lhs.getDate().compareTo(rhs.getDate());
            }
        });
        tweets = tweetsTest;
        return tweetsTest;
    }

    public int getCount(){
        return tweets.size();
    }
}
