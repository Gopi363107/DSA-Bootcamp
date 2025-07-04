import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class MinimumDepth {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<Map.Entry<TreeNode, Integer>> q = new LinkedList<>();
        q.offer(new AbstractMap.SimpleEntry<>(root, 1));

        while (!q.isEmpty()) {
            Map.Entry<TreeNode, Integer> entry = q.poll();
            TreeNode node = entry.getKey();
            int depth = entry.getValue();

            if (node.left == null && node.right == null)
                return depth;

            if (node.left != null)
                q.offer(new AbstractMap.SimpleEntry<>(node.left, depth + 1));
            if (node.right != null)
                q.offer(new AbstractMap.SimpleEntry<>(node.right, depth + 1));
        }

        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        MinimumDepth obj = new MinimumDepth();
        System.out.println("Minimum Depth: " + obj.minDepth(root));
    }
}

