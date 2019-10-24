import java.util.*;
import java.io.*;

class NodeBST{
    NodeBST left,right;
    int data;
    NodeBST (int data){
        this.data=data;
        left=right=null;
    }
}
class Day23 {

    static void levelOrder(NodeBST root){
        Queue<NodeBST> bstQueue = new LinkedList();
        bstQueue.add(root);
        while(bstQueue.size() > 0) {
            NodeBST cur = bstQueue.remove();
            System.out.print(cur.data + " ");
            bstQueue.add(cur.left);
            bstQueue.add(cur.right);
        }
    }

    public static NodeBST insert(NodeBST root, int data){
        if(root==null){
            return new NodeBST(data);
        }
        else{
            NodeBST cur;
            if(data<=root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeBST root = null;
        while(T-->0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}