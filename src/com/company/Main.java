package com.company;

public class Main {
    public static int calculateHighScorePosition(int score)
    {
        int position =4;
        if(score>=1000)
        {
            position=1;
        } else if(score >=500)
        {
            position=2;
        }
        else if(score >= 100)
        {
            position=3;
        }
        return position;
    }
    public static void displayHighScorePosition(String name,int position)
    {
        System.out.println(name+"  has  managed to get into  " + position +" position on ScoreBoard.");
    }

    public static void main(String[] args) {
    displayHighScorePosition("B",calculateHighScorePosition(1500));
    displayHighScorePosition("P",calculateHighScorePosition(877));
    displayHighScorePosition("C",calculateHighScorePosition(450));
    displayHighScorePosition("D",calculateHighScorePosition(50));
    }
}
