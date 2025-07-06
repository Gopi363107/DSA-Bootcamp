import java.util.*;
public class inorder_traversal {
    static void inorder(Node root , List<Integer> arr ){
        if(root == null){
            return;
        }

        inorder(root.left , arr);
        arr.add(root.data);
        inorder(root.right , arr);
    }

    static List<Integer> inOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        inorder(root , arr);
        return arr;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(6);
        root.right.right = new Node(9);
        root.left.right = new Node(8);

        List<Integer>  result = inOrder(root);

        System.out.println("after inorder :");

        for(int val : result){
            System.out.print(val+" ");
        }
        System.out.println();

    }
    
}
class Node{
    int data;
    Node left;
    Node right;

    Node (int val){
        data = val ;
        left = null ;
        right = null ;
    }
}
