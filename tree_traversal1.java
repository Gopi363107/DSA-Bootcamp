import java.util.*;
public class tree_traversal1{
    static void printList(List<Integer> list){
        for(int st : list){
            System.out.print(st +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        tree_traversal solution = new tree_traversal();

        List<List<Integer>> result = solution.levelOrder(root);

        System.out.println("After tree traversal ");

        for(List<Integer> level : result ){
            printList(level);
        }
    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int x){
        this.val = x;
        this.left = null;
        this.right = null;
    }

    TreeNode(int x , TreeNode left, TreeNode right){
        this.val = x;
        this.left = left;
        this.right = right;
    }
}
class tree_traversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans= new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left != null){
                    q.add(node.left);

                }
                if(node.right != null){
                    q.add(node.right);
                }   
            }
            ans.add(level);   
        }
        return ans;
    }
}

