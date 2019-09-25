import java.io.*;
import java.util.*;

public class Day6 {

    Scanner sc = new Scanner(System.in);
    int testNum = sc.nextInt();
    String word1 = sc.next() + sc.nextLine();
    String word2 = sc.nextLine();

    public void processWord(String word) {
        int length;
        if(word.length() % 2 == 1) {
            length = (word.length() + 1) / 2;
        } else {
            length = word.length() / 2;
        }
        char[] evens = new char[length];
        char[] odds = new char[length];
        for(int i = 0; i < word.length(); i++) {
            if(i == 0 ) {
                evens[0] = word.charAt(i);
            } else if (i == 1) {
                odds[0] = word.charAt(i);
            } else if(i % 2 == 0) {
                evens[i / 2] = word.charAt(i);
            } else {
                odds[(i - 1) / 2] = word.charAt(i);
            }
        }
        String evenString = new String(evens);
        String oddString = new String(odds);
        System.out.print(evenString + " " + oddString);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Day6 solution = new Day6();
        solution.processWord(solution.word1);
        System.out.println();
        solution.processWord(solution.word2);
    }
}

