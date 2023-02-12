
package com.mycompany.numberguess;

import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int answer = (int) (Math.random() * 100) + 1;
        int k = 5;
        boolean correct = false;
        String ans = "N";
        
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have 7 tries to guess the number.");       
        do {
            answer = (int) (Math.random() * 100) + 1;
            k = 7;
            correct = false;
            while (k > 0) {
                System.out.println("\nEnter your guess: ");
                int guess = sc.nextInt();

                if (guess == answer) {
                    System.out.println("\nYayyyy!!!\nYou guessed the number!\nYou win!");
                    correct = true;
                    break;
                } else if (guess > answer) {
                    System.out.println("Your guess is HIGH.\nYou have " + (k - 1) + " tries left.");
                } else {
                    System.out.println("Your guess is LOW.\nYou have " + (k - 1) + " tries left.");
                }
                k--;
            }
            if (correct == false) {
                System.out.println("\nYou ran out of tries :( \nYou lose!");
                System.out.println("The number was : " + answer);
            }
            System.out.println("\nDo you want to continue(Y/N)?");
            ans = sc.next();
        } while (ans.equals("Y"));
    }
}