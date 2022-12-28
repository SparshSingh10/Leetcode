class Solution {
    public String minWindow(String str, String ti) {
        int[] freqt = new int[123];
        for (int i = 0; i < ti.length(); i++) {
            char ch = ti.charAt(i);
            freqt[ch]++;
        }
          int[] freq= new int[123];
         int ei = 0;
       int start = -1;
         int si = 0;
     int count = 0;
       int len = Integer.MAX_VALUE;
         while (ei < str.length()) {
           char ch = str.charAt(ei);
             freq[ch]++;
            if (freqt[ch] >= freq[ch]) {
           count++;
         }
       if (count==ti.length()) {
              while (freq[str.charAt(si)] > freqt[str.charAt(si)] && si <= ei) {
                 freq[str.charAt(si)]--;
                    si++;
            }
         if (len>(ei-si+1)) {
                   len=ei-si + 1;
                  start=si;
        }
             }
         ei++;
         }
        if (start==-1) {
             return "";
         }
         return str.substring(start,start+len);
    }
}
    

