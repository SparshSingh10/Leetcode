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
    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> lis = new ArrayList<Integer>();
        inOrder(root,lis);
        return lis;
    }
    public static void inOrder(TreeNode root,List<Integer> lis) {
		if(root == null) return;
		
		inOrder(root.left,lis);
        lis.add(root.val);
		inOrder(root.right,lis);
		
    }
}