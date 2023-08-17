class Solution {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int s) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return s * 10 + root.val;
        int left = sum(root.left, s * 10 + root.val);
        int right = sum(root.right, s * 10 + root.val);
        return left + right;
    }
}
