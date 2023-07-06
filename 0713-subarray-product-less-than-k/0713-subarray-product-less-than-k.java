class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k == 0) 
            return 0;
          int count=0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<arr.length){
            // grow
            p*=arr[ei];
            // shrink
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;

            }
            count+=(ei-si+1);
            ei++;
        }
        return count;       
    }
}