package com.bridgelabz.basics;

public class SnakeAndLadder {
    static int currentPosition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake and Ladder");
        System.out.println("Starting Position =>" + " " + currentPosition);
            int dice =( int )(Math.random() * 10)%6+1;
            System.out.println(dice);
    }
}
