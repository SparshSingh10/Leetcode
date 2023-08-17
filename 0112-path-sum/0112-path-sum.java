class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        
        // Check if the current node is a leaf node
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        
        // Recursively check the left and right subtrees
        boolean hasLeftPathSum = hasPathSum(root.left, targetSum - root.val);
        boolean hasRightPathSum = hasPathSum(root.right, targetSum - root.val);
        
        return hasLeftPathSum || hasRightPathSum;
    }
}
