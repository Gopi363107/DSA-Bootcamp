import java.util.*;
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


public class heightOf_Tree {
    public static void main(String args[]){
        Node root= new Node(1);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.right.right = new Node(8);
        root.left.right = new Node(9);
        root.left.right.left = new Node(2);
        root.left.right.left.left = new Node(7);

        solution sol  =new solution();

        int depth = sol.maxdepth(root);

        System.out.println("maximum depth of the tree :" + depth);

        int height = sol.depth(root);
        System.out.println("level order traversal using another method : "+ height);

    }
}

class solution{
    int maxdepth(Node root){
        if(root == null)
        return 0;
        Queue<Node> q = new LinkedList<>();
        int level = 0;
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i <size; i++) {
                Node front = q.poll();

                if(front.left != null){
                    q.add(front.left);
                }

                if(front.right != null){
                    q.add(front.right);
                }

            }
            level++;
        }
        return level;
    }

    int depth(Node root){
        if(root == null){
            return 0;
        }

        int lh = depth(root.left);
        int rh = depth(root.right);

        return 1+ Math.max(lh,rh);
    }

    
}

