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
  public boolean isIdentical(TreeNode root,TreeNode subRoot){
      // dono null hai matlab end tak sub root jaise hai,shi hai
       if(subRoot == null && root == null){
           return true;
       }
      // dono mai se ek alag hai matlab condition false;
       if(root == null || subRoot == null){
           return false;
       }
      // node same hai,tho firse tho saare cheak karde base case tak;
       if(root.val == subRoot.val){
           return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
       }
       return false;
   }

     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         // null subroot chale ga
       if(subRoot == null){
           return true;
       }
         // main root null nhi chale ga
       if(root == null){
           return false;
       }
         // cheack kar ki sub root jaisa root ha na agla
       if(isIdentical(root, subRoot)){
           return true;
       }
         // nhi hai tho child node k cheack kar
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
   }

}