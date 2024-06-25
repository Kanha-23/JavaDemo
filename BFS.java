

import java.util.*;
class Node {
    int val;
    Node left= null;
    Node right= null;

    public Node(int val) {
        this.val = val;
   
    }
}


public class BFS {
  
    public static boolean printlevel(Node root,int level){
        if(root==null){
            return false;
        }
        if(level==1){
            System.out.print(root.val+" ");
            return true;
        }

        boolean left =printlevel(root.left, level-1);
        boolean right =printlevel(root.right, level-1);

        return (left || right);

    }
    public static void levelOrderTraversal(Node root){
        int level=1;
        while(printlevel(root,level)==true){
           
            level++;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        levelOrderTraversal(root);


    }
}

