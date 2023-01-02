class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int ans = Integer.MAX_VALUE;
        int si = 0;
        int ei = 0;
        int sum = 0;
        while(ei<arr.length){
            if(sum<t)
                sum = sum+arr[ei];
            
            if(sum >= t){
                ans = Math.min(ans,ei-si+1);
            }
            while(sum>=t && si<ei){
                sum = sum - arr[si];
                si++;
                if(sum>=t){
                    ans = Math.min(ans, ei-si+1);
                }
            }
            
            ei++;
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}