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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res =new ArrayList();
        if(root==null)
            return null;
        String str=Integer.toString(root.val);
        if(root.left==null && root.right==null)
            res.add(str);
         if(root.left!=null)
         dfs(root.left,str,res);
    if(root.right!=null)
         dfs(root.right,str,res);
        return res;
    }
    public static void dfs(TreeNode node,String str,List<String> res){
        str+= "->" +node.val;
        if(node.left==null && node.right==null){
            res.add(str);
            return;
            }
    if(node.left!=null)
         dfs(node.left,str,res);
    if(node.right!=null)
         dfs(node.right,str,res);
}}