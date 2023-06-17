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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> lis=new ArrayList<Integer>();
        if(root==null)
            return lis;
          Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        // int res=0;
        int max=Integer. MIN_VALUE;
        while(q.size()>0)
        {
            max=Integer. MIN_VALUE;
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                
                TreeNode node=q.remove();
                max=Math.max(node.val,max);
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            lis.add(max);
        }
        return lis;
    }
}