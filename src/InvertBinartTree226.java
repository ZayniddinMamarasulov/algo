public class InvertBinartTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tempLeft = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tempLeft);
        }

        return root;
    }
}
