class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int ei=0;
        int si=0;
        int [] freq=new int[256];
        while(ei<s.length()){
            // grow
            freq[s.charAt(ei)]++;
            // shrink
            while(freq[s.charAt(ei)]>1){
                freq[s.charAt(si)]--;
                si++;
            }
            // ans calculate
            ans=Math.max(ans,ei-si+1);
            ei++;
    }
    return ans;
}
}