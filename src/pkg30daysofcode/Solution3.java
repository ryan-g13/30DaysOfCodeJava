/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3 {

    private void evaluate(int num) {
        if(num % 2 == 1) {
            System.out.println("Weird");
        } else if(num % 2 == 0 && (num >= 2 && num <= 5)) {
            System.out.println("Not Weird");
        } else if(num % 2 == 0 && (num >= 6 && num <= 20)) {
            System.out.println("Weird");
        } else if(num % 2 == 0 && (num > 20)) {
            System.out.println("Not Weird");
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sol.evaluate(N);
        scanner.close();
    }
}