public class SymmetricTreeRecursive {
    public boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null || a.data != b.data) return false;
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        SymmetricTreeRecursive sol = new SymmetricTreeRecursive();
        System.out.println("Is Symmetric (Recursive): " + sol.isSymmetric(root)); // true
    }
}

