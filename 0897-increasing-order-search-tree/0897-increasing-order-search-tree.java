/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode dummy = new TreeNode(0);
    TreeNode tmp = dummy;
    TreeNode inorder(TreeNode root, TreeNode tmp) {
        if (root == null)
            return tmp;
        
        tmp = inorder(root.left, tmp);
        tmp.right = root;
        root.left = null;
        tmp = root;
        return inorder(root.right, tmp);
    }
    
    TreeNode increasingBST(TreeNode root) {
        inorder(root, tmp);
        return dummy.right;
    }
}