class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int[] heights = new int[matrix[0].length];
        int maxArea=-1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]=='0'){
                    heights[j] = 0;
                } else {
                    heights[j] ++;
                }
            }            
            int area = Area(heights);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }  
    public static int Area(int[] arr) {

		int maxArea = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int r = i;
				int h = arr[st.pop()];
				if (st.isEmpty()) {
					maxArea = Math.max(maxArea, (r * h));
				} else {
					int l = st.peek();
					maxArea = Math.max(maxArea, ((r - l - 1) * h));
				}

			}
			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {

			int h = arr[st.pop()];
			if (st.isEmpty()) {
				maxArea = Math.max(maxArea, (r * h));
			} else {
				int l = st.peek();
				maxArea = Math.max(maxArea, ((r - l - 1) * h));
			}

		}
		return maxArea;

	}
}