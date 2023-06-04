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
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> lis = new ArrayList<Integer>();
        postOrder(root,lis);
        return lis;
    }
    public static void postOrder(TreeNode root,List<Integer> lis) {
		if(root == null) return;
		
		postOrder(root.left,lis);
		postOrder(root.right,lis);
		lis.add(root.val);
    }
}