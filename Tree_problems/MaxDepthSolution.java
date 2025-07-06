import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}


public class MaxDepthSolution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        MaxDepthSolution sol = new MaxDepthSolution();
        System.out.println("Max Depth: " + sol.maxDepth(root)); // Output: 3
    }
}
