public class SameTreeSolution {
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.data != q.data) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);

        Node tree2 = new Node(1);
        tree2.left = new Node(2);
        tree2.right = new Node(3);

        SameTreeSolution sol = new SameTreeSolution();
        System.out.println("Same Tree: " + sol.isSameTree(tree1, tree2)); // true
    }
}

