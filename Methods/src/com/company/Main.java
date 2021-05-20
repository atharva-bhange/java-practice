package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pre");
        int highScore = calculateScore(true, 800, 5,100);
        System.out.println("Score is "+highScore);
        highScore = calculateScore(true,10000,8,200);
        System.out.println("Score is "+highScore);
        System.out.println("post");
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;
        if(gameOver){
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
