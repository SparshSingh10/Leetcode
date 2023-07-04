import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int numRooms = rooms.size();
        boolean[] visited = new boolean[numRooms];
        visited[0] = true; // Mark the starting room as visited
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); // Add the starting room to the queue
        
        while (!queue.isEmpty()) {
            int room = queue.poll(); // Get the next room from the queue
            
            // Visit all the neighboring rooms
            for (int neighbor : rooms.get(room)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark the neighbor as visited
                    queue.offer(neighbor); // Add the neighbor to the queue
                }
            }
        }
        
        // Check if all rooms have been visited
        for (boolean roomVisited : visited) {
            if (!roomVisited) {
                return false;
            }
        }
        
        return true;
    }
}
