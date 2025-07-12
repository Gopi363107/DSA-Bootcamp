import java.util.*;
public class preorder_traversal {
    static void preorder(Node root , List<Integer> arr){
        if (root == null){
            return;
        }

        arr.add(root.data);
        preorder(root.left , arr);
        preorder(root.right , arr);

    }
    static List<Integer> preOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        preorder(root,arr);
        return arr;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = preOrder(root);

        System.out.print("Preorder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
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
        right= null;
    }
}
