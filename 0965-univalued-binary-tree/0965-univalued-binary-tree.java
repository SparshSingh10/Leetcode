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
        if(root == null)//base case for null graph 
            return false;
        return check(root,root.val);//helper method to calculate recursively 
    }
    public boolean check(TreeNode root, int val)
    {
        if(root == null)//base case 
            return true;
        else if(root.val != val)//if by chance false is returned the tree is not Univalued 
            return false;

            return check(root.left, val) && check(root.right, val);//if both left and right subtree has the the same valued node it returns true else false  
    }
}//Do Upvote, it helps a lot.