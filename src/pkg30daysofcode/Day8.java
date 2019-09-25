//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> addressBook = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phoneNum = in.nextInt();
            // Write code here
            addressBook.put(name, phoneNum);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(addressBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + addressBook.get(s));
            }
        }
        in.close();
    }
}

