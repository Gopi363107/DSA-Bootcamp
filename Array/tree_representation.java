public class tree_representation {
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(7);
        root.right.left = new Node(4);
    }
    
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data = key;
        left = null;
        right = null;
    }
}
