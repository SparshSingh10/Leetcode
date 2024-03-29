class Solution {
    public int maximalRectangle(char[][] a) {
        int[] currow = new int[a[0].length];
        int maxans=-1;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    if(a[i][j]=='1')
                        currow[j]+=1;
                    else
                        currow[j]=0;
                    }
                
                int curans=largestRectangleArea(currow);
                maxans=Math.max(maxans,curans);
            }
            return maxans;
        }
        
     public int largestRectangleArea(int[] heights) {
        int ans=Integer.MIN_VALUE;
        int leftindex[]=ps(heights);
        int rightindex[]=ns(heights);
        for(int i=0;i<heights.length;i++){
            int area=(rightindex[i]-leftindex[i]-1)*heights[i];
            ans=Math.max(ans,area);
        }
        return ans;
    }
    public int[] ns(int heights[]){
        Stack<Integer> st=new Stack<>();
        int rightindex[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty()){
                rightindex[i]=heights.length;
            }
            else{
                rightindex[i]=st.peek();
            }
            st.push(i);
        }
        return rightindex;
    }
     public int[] ps(int heights[]){
        Stack<Integer> st=new Stack<>();
        int[] leftindex=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty()){
                leftindex[i]=-1;
            }
            else{
                leftindex[i]=st.peek();
            }
            st.push(i);
        }
        return leftindex;
    }
}