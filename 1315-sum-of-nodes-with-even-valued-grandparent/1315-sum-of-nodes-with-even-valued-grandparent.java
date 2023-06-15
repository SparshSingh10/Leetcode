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
     int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null)
            return 0;
       
        return helper(root,null,null);
    }
    public int helper(TreeNode beta,TreeNode papa,TreeNode dadaji){
        if(beta==null)
            return 0;
        if(dadaji!=null &&dadaji.val%2==0)
            sum+=beta.val;
        helper(beta.left,beta,papa);
        helper(beta.right,beta,papa);
        return sum;
    }
}