import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Day15 {

    public static Node insert(Node head, int data) {
        //Complete this method
        Node newInsert = new Node(data);
        if(head == null) {
            head = newInsert;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newInsert;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
