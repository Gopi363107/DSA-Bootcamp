import java.util.*;

public class stack_preorder_traversal{
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(12);
        root.right.right = new TreeNode(19);
        root.left.right = new TreeNode(28);
        root.right.left = new TreeNode(20);
        root.left.left.right = new TreeNode(15);

        stack_preorder  sol = new stack_preorder ();

        List<Integer> result = sol.preOrder_stack(root);

        System.out.println("after preorder using stack :");

        for(int val : result){
            System.out.print(val+" ");
        }
        System.out.println();


    }

}
class stack_preorder {
    static List<Integer> preOrder_stack(TreeNode root){
        List<Integer> arr = new ArrayList<>();

        if(root == null){
            return arr;
        }

        Stack<TreeNode> st = new Stack<>();

        st.push(root);
        while(!st.empty()){
            root = st.pop();
            arr.add(root.data);
            if(root.right != null){
                st.push(root.right);
            }

            if(root.left != null){
                st.push(root.left);
            }

        }
        return arr;

    }
     
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        data = x ;
        left = null;
        right = null;
    }
}
