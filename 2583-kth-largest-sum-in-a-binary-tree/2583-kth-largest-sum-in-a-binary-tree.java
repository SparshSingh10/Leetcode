import java.util.*;

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null)
            return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Long> levelSums = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long levelSum = 0;
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                
                if (node.left != null)
                    queue.offer(node.left);
                
                if (node.right != null)
                    queue.offer(node.right);
            }
            
            levelSums.add(levelSum);
        }
        
        Collections.sort(levelSums, Collections.reverseOrder());
        
        if (k <= levelSums.size()) {
            return levelSums.get(k - 1);
        } else {
            return -1; // Return -1 if k is out of bounds
        }
    }
}
