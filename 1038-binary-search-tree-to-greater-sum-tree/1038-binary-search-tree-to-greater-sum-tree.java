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
    // TreeNode prev=null;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null)
            return root;
        int[] sum = new int[1];
        sum[0] = 0;
    preOrder(root,sum);
        return root;
        
    }
    public void preOrder(TreeNode root,int[] sum) {
		if(root == null) return;
        preOrder(root.right,sum);
        sum[0]+=root.val;
        root.val=sum[0];
        preOrder(root.left,sum);
		
	}
	
}