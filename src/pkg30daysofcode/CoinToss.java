/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;


import java.util.Random;

public class CoinToss {

    public String flipCoin() {
        Random randNum = new Random();
        int tossValue = Math.abs(randNum.nextInt()) % 2;
        if(tossValue == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
        CoinToss toss = new CoinToss();
        System.out.println(toss.flipCoin());
    }
}