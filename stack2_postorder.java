import java.util.*;


public class stack2_postorder {
    static List<Integer> preOrder(Node root){
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while(!st1.empty()){
            root = st1.pop();

            st2.push(root);

            if(root.left != null ){
                st1.push(root.left);
            }

            if(root.right != null){
                st1.push(root.right);
            }

        }

        while(!st2.empty()){
            ans.add(st2.pop().data);
        }

        return ans;
    }

    public static void printlist(List<Integer> list){

        for(int num : list){
            System.out.print(num +" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(2);
        root.right.right = new Node(6);
        root.right.left = new Node(8);

        List<Integer> list = preOrder(root);
        System.out.println("after using two stack for traversal :");
        printlist(list);
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


