import java.util.*;
public class PreInPostOrder_Treaversal {
    
    public static List<List<Integer>> Traversal(Node root){
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post  = new ArrayList<>();

        if(root == null){
            return new ArrayList<>();
        }

        Stack<Pair< Node ,Integer >> st = new Stack<>();

        st.push(new Pair<>(root , 1));

        while(!st.empty()){
            Pair<Node , Integer> it = st.pop();

            if(it.getValue() == 1){
                pre.add(it.getKey().data);
                // Move to state 2
                // (inorder) for this node
                it.setValue(2);
                // Push the updated state
                // back onto the stack
                st.push(it);
                if (it.getKey().left != null) {
                    st.push(new Pair<>(it.getKey().left, 1));
                }
            }
            
            

            // this is a part of in
            else if (it.getValue() == 2) {
                // Store the node's data
                // in the inorder traversal
                in.add(it.getKey().data);
                // Move to state 3
                // (postorder) for this node
                it.setValue(3);
                // Push the updated state
                // back onto the stack
                st.push(it);

                // Push right child onto
                // the stack for processing
                if (it.getKey().right != null) {
                    st.push(new Pair<>(it.getKey().right, 1));
                }
            }

            // this is part of post
            else {
                // Store the node's data
                // in the postorder traversal
                post.add(it.getKey().data);
            }
        }

        // Returning the traversals
        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    // Function to print the
    // elements of a list
    public static void printList(List<Integer> list) {
        // Iterate through the list
        // and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting the pre-order, in-order,
        // and post-order traversals
        List<Integer> pre, in, post;
        List<List<Integer>> traversals = Traversal(root);

        // Extracting the traversals
        // from the result
        pre = traversals.get(0);
        in = traversals.get(1);
        post = traversals.get(2);

        // Printing the traversals
        System.out.print("Preorder traversal: ");
        printList(pre);

        System.out.print("Inorder traversal: ");
        printList(in);

        System.out.print("Postorder traversal: ");
        printList(post);
    }
}
       

class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        data = val ;
        left = null;
        right = null;
    }
}
