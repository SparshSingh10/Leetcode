import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int numRooms = rooms.size();
        
        dfs(0, rooms);
        
        // Check if all rooms have been visited
        for (List<Integer> keys : rooms) {
            if (!keys.isEmpty()) {
                return false;
            }
        }
        
        return true;
    }
    
    private void dfs(int room, List<List<Integer>> rooms) {
        List<Integer> keys = rooms.get(room);
        rooms.set(room, Collections.emptyList()); // Mark the current room as visited
        
        for (int key : keys) {
            dfs(key, rooms);
        }
    }
}
