/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    int theNumber;
    int maxNum;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber() {
        Random rand = new Random();
        maxNum = 100;
        theNumber = Math.abs(rand.nextInt()) % (maxNum + 1);
    }

    public void play() {
        System.out.println("Welcome to the Game, please guess between 0 and " + maxNum + " inclusively:");
        while(true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your guess is too high");
            } else if (move < theNumber) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("You guessed correctly " + theNumber);
                break;
            }
        }
    }

    public static void howLargeIsNum(int x) {
        if(x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if(x >= 11 && x <= 100) {
            System.out.println("Our number is pretty large");
        } else {
            System.out.println("Number is out of range");
        }
    }

    public static void main(String[] args) {
        GuessNumber gn = new GuessNumber();
        gn.play();
//        Testing the boundary conditions for the method
//        howLargeIsNum(0);
//        howLargeIsNum(10);
//        howLargeIsNum(11);
//        howLargeIsNum(100);
//        howLargeIsNum(11111);
//        howLargeIsNum(-1);
    }
}