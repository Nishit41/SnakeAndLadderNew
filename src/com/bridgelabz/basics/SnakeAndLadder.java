package com.bridgelabz.basics;

    public class SnakeAndLadder {
        static int position = 0;
        static final int SNAKE = 2;
        static final int NO_PLAY = 1;
        static final int LADDER = 3;
        static int dieRoll(){
        return (int)(Math.random()*10)%6+1;
    }
    static int getOption(){
        return (int)(Math.random()*10)%3+1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Snake and Ladder");
        System.out.println("Starting Position =>" + " " + position);
         int dieNum = dieRoll();
         int option = getOption();
         switch (option){
             case SNAKE :
                 position -= dieNum;
                 break;
             case LADDER :
                 position += dieNum;
                 break;
             case NO_PLAY:
                 break;
             default:
         }

    }
}
