package com.company;
import java.util.Scanner;
import java.util.Random;
public class L10_PQ21_rock_paper_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("1 = Rock\n2 = Paper\n3 = Scissor\n(There will be 5 matches.)\nTry your best to win this tournament!!");
        int comp = 0;
        int youp = 0;
        for(int i = 0; i<5; i++){
            System.out.println("___________________");

            System.out.print("Enter choice: ");
            int attack = sc.nextInt();
            System.out.println("");
            int rand = ran.nextInt(3)+1;

            if (attack==1&&rand==1){
                System.out.println("You: Rock");
                System.out.println("Computer: Rock\n");
                System.out.println("Game is tie\n");

            }if (attack==2&&rand==2){
                System.out.println("You: Paper");
                System.out.println("Computer: Paper\n");
                System.out.println("Game is tie\n");

            }if (attack==3&&rand==3){
                System.out.println("You: Scissor");
                System.out.println("Computer: Scissor\n");
                System.out.println("Game is tie\n");

            }if (attack==1&&rand==2){
                System.out.println("You: Rock");
                System.out.println("Computer: Paper\n");
                System.out.println("You lose\n");
                comp += 1;

            }if (attack==1&&rand==3){
                System.out.println("You: Rock");
                System.out.println("Computer: Scissor\n");
                System.out.println("You won\n");
                youp += 1;

            }if (attack==2&&rand==1){
                System.out.println("You: Paper");
                System.out.println("Computer: Rock\n");
                System.out.println("You won\n");
                youp += 1;

            }if (attack==2&&rand==3){
                System.out.println("You: Paper");
                System.out.println("Computer: Scissor\n");
                System.out.println("You lose\n");
                comp += 1;

            }if (attack==3&&rand==1){
                System.out.println("You: Scissor");
                System.out.println("Computer: Rock\n");
                System.out.println("You lose\n");
                comp += 1;


            }if (attack==3&&rand==2){
                System.out.println("You: Scissor");
                System.out.println("Computer: Paper\n");
                System.out.println("You won\n");
                youp += 1;

            }if (attack!=1&&attack!=2&&attack!=3){
                System.out.println("Invalid Input.\n");


            }
        }
// calculating the score and declared the winner !!
        if (youp<comp){
            System.out.println("____________________");
            System.out.println("Computer points: "+comp);
            System.out.println("Your points: "+youp+"\n");
            System.out.println("Result: You lose this battle😭");
        }
        else if (youp>comp){
            System.out.println("____________________");
            System.out.println("Computer points: "+comp);
            System.out.println("Your points: "+youp+"\n");
            System.out.println("Result: 🎉You won this match!!🤩");
        }
        else {
            System.out.println("_____________________");
            System.out.println("Computer points: " + comp);
            System.out.println("Your points: " + youp + "\n");
            System.out.println("Result: This Match is Draw!");
        }
    }
}
