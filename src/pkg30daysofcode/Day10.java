import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

    public static int maxOnes(int n) {
        String binNum = Integer.toBinaryString(n);
        int onesCount = 0;
        int temp = 0;
        for(int i = 0; i < binNum.length(); i++) {
            if(binNum.charAt(i) == '0') {
                temp = 0;
            } else {
                temp++;
                onesCount = Math.max(onesCount, temp);
            }
        }
        return onesCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(maxOnes(n));
        // iterate through the string counting consecutive 1's return this integer.
        // System.out.println(onesCount);
        scanner.close();
    }
}
