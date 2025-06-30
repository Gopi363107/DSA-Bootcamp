import java.util.*;
public class stack_postorder1 {
    static void postorder(Node root, List<Integer> arr){
        if(root == null){
            return;
        }

        postorder(root.left , arr);
        postorder(root.right , arr);
        arr.add(root.data);
    }

    static List<Integer> postOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        postorder(root , arr);
        return arr;
    }

    public static void main(String args[]){
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(13);
        root.right.right = new Node(34);
        root.left.left.right = new Node(25);
        root.right.right.left = new Node(14);

        List<Integer> result = postOrder(root);

        System.out.println("after post order in tree");
        for(int value : result){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
