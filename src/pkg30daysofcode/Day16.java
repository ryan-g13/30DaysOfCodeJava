import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        checkString(S);
    }

    public static void checkString(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException err) {
            System.out.println("Bad String");
        }
    }
}
