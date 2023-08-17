class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null || root1.val != root2.val)
            return false;

        boolean flip = helper(root1.left, root2.right) && helper(root1.right, root2.left);
        boolean noflip = helper(root1.left, root2.left) && helper(root1.right, root2.right);

        return flip || noflip;
    }

    public boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null || root1.val != root2.val)
            return false;

        boolean flip = helper(root1.left, root2.right) && helper(root1.right, root2.left);
        boolean noflip = helper(root1.left, root2.left) && helper(root1.right, root2.right);
        return flip || noflip;
    }
}
