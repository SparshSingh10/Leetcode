class Solution {
    public boolean findTarget(TreeNode root, int k){
        return helper(root,root,k);
    }
    public boolean helper(TreeNode root,TreeNode current,int k){
        if(current==null){
            return false;
        }
        if(findInTree(root,current,k-current.val)){
            return true;
        }
        
        return helper(root,current.left,k)||helper(root,current.right,k);
    }
    public boolean findInTree(TreeNode root,TreeNode current,int k){
        if(root==null){
            return false;
        }
        
        if(root.val>k){
            return findInTree(root.left,current,k);
        }
        else if(root.val<k){
            return findInTree(root.right,current,k);
        }
        else{
            return k!=current.val;
        }
        
    }
        
}