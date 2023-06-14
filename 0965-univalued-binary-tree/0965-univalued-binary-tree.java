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
class Solution
{
    public boolean isUnivalTree(TreeNode root) 
    {
        if(root == null) 
            return false;
        return check(root,root.val);
    }
    public boolean check(TreeNode root, int val)
    {
        if(root == null) 
            return true;
        else if(root.val != val)//if by chance false is returned the tree is not Univalued 
            return false;
        else
            return check(root.left, val) && check(root.right, val);//if both left and right subtree has the the same valued node it returns true else false  
    }
}//Do Upvote, it helps a 