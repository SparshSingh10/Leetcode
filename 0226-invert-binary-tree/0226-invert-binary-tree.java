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
    TreeNode temp=new TreeNode();
                
    public TreeNode invertTree(TreeNode root) {
      if(root==null)
          return root;
        invertTree(root.left);
        invertTree(root.right);
        temp=root.right;
        root.right=root.left;
        root.left=temp;
        return root;
        
}
}