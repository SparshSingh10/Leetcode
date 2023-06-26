class Solution {
    public boolean canFinish(int V, int[][] prerequisites) {
          int n = V;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int a = prerequisite[0];
            int b = prerequisite[1];
            adj.get(a).add(b);
        }
        boolean[] visited=new boolean[V];
        boolean[] currvisited=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                if(dfs(i,visited,currvisited,adj))
                return false;
        }
            
        }
        return true;
        
    }
    public boolean dfs(int node,boolean[] visited,boolean[] currvisited,List<List<Integer>> adj){
        visited[node]=true;
        currvisited[node]=true;
        for(int neighbour:adj.get(node)){
            if(visited[neighbour]==false){
                if(dfs(neighbour,visited,currvisited,adj))
                return true;
            }
        else if(visited[neighbour] && currvisited[neighbour])
            return true;
        }
        currvisited[node]=false;
        return false;
        }
    
    }
