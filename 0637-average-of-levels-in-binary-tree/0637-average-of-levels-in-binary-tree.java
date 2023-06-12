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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>result=new ArrayList();
        if(root==null)
            return result;
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        double sum=0;
        while(!q.isEmpty()){
            sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            sum+=node.val;
            if(node.left!=null)
                q.offer(node.left);
            if(node.right!=null)
                q.offer(node.right);
        }
        result.add(sum/size);
}
    return result;
}
}