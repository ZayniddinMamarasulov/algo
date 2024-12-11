public class DiameterOfBinaryTree543 {
    int diameter = 0;

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);

        int d = leftDepth + rightDepth;
        diameter = Math.max(diameter, d);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);

        return diameter;
    }
}
