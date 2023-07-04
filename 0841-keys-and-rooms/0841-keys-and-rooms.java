class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int numRooms = rooms.size();
        boolean[] visited = new boolean[numRooms];
        
        // Start the DFS from room 0
        dfs(0, rooms, visited);
        
        // Check if all rooms have been visited
        for (boolean roomVisited : visited) {
            if (roomVisited==false) {
                return false;
            }
        }
        
        return true;
    }
    
    private void dfs(int room, List<List<Integer>> rooms, boolean[] visited) {
        visited[room] = true; // Mark the current room as visited
        
        // Visit all the neighbors
        for (int neighbour : rooms.get(room)) {
            if (visited[neighbour]==false) {
                dfs(neighbour, rooms, visited);
            }
        }
    }
}
