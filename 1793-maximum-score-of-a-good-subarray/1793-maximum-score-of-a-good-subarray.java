class Solution {
      public int maximumScore(int[] nums, int k) {
        int [] ns = ns(nums);
        int [] ps = ps(nums);
        
        int score =0;
        for(int i=0;i<nums.length;i++){
           int l = ps[i];
           int r = ns[i];
           if(l+1 <= k && r-1>= k){
               score = Math.max(score,nums[i] *(r-l-1));
           }
        }
        return score;
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