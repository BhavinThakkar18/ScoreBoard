package com.company;

public class Main {
    public static int calculateHighScorePosition(int score)
    {
        if(score>=1000)
        {
            return 1;
        }
        else if(score>=500)
        {
            return 2;
        }
        else if(score >= 100)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
    public static void displayHighScorePosition(String name,int position)
    {
        System.out.println(name+"  has  managed to get into position = " + position);
    }

    public static void main(String[] args) {
    displayHighScorePosition("B",calculateHighScorePosition(1500));
    displayHighScorePosition("P",calculateHighScorePosition(877));
    displayHighScorePosition("C",calculateHighScorePosition(450));
    displayHighScorePosition("D",calculateHighScorePosition(50));
    }
}
