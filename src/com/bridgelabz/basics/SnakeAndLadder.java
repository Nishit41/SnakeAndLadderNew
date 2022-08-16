package com.bridgelabz.basics;

    public class SnakeAndLadder {
        static int position = 0;
        static final int SNAKE = 2;
        static final int NO_PLAY = 1;
        static final int LADDER = 3;
        static final int WINNINGPOSITION = 100;
        static final int INITIALPOSITION = 0;
        static int dieCount=0;
        static int dieRoll(){
            dieCount++;
            return (int)(Math.random()*10)%6+1;
        }
    static int getOption(){
        return (int)(Math.random()*10)%3+1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Snake and Ladder");
        System.out.println("Starting Position =>" + " " + position);
        while ( position <=100 ) {
            int dieNum = dieRoll();
            int option = getOption();
            switch (option) {
                case SNAKE:
                    position -= dieNum;
                    if(position < INITIALPOSITION )
                    {
                      position = INITIALPOSITION;
                    }
                    break;
                case LADDER:
                    if(position+dieNum < WINNINGPOSITION )
                    {
                        position += dieNum;
                    }
                    break;
                case NO_PLAY:
                    break;
                default:
             }
            System.out.println("position after everydieRoll"+" "+position);
         }
        System.out.println("diecount"+" "+dieCount);
        }
}
