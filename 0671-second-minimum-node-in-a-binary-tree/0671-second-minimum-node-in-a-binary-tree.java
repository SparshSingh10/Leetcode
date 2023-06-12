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
    public int findSecondMinimumValue(TreeNode root) {
        
        int min = root.val;
        int secondMin = root.val;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            TreeNode node = queue.poll();
            min = Math.min(min, node.val);
            
            if(min == Math.min(secondMin, node.val)){
                secondMin = Math.max(secondMin, node.val);
            }else{
                secondMin = Math.min(secondMin, node.val);
            }
            
            if(node.left!=null)
            queue.add(node.left);
            
            if(node.right!=null)
            queue.add(node.right);
        }
        
        return secondMin == min? -1: secondMin;
    }
}