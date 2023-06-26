class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list from prerequisites
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            adj.get(prerequisiteCourse).add(course);
        }
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] currVisited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (hasCycle(i, adj, visited, currVisited, stack)) {
                    return new int[0];  // Cycle detected, return an empty array
                }
            }
        }
         int[] result = new int[numCourses];
        int index = 0;

        while (!stack.isEmpty()) {
            result[index++] = stack.pop();
        }

        return result;
    }
     private boolean hasCycle(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
                             boolean[] currVisited, Stack<Integer> stack) {
        visited[node] = true;
        currVisited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (hasCycle(neighbor, adj, visited, currVisited, stack)) {
                    return true;
                }
            } else if (currVisited[neighbor]) {
                return true;
            }
        }

        currVisited[node] = false;
        stack.push(node);
        return false;
    }
    }
