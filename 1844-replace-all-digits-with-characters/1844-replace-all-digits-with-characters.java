class Solution {
    public String replaceDigits(String s) {
        int l=s.length();
        int i;
        String ans="";
        for(i=1;i<l;i+=2)
        {
            char ch=(char)(s.charAt(i-1)+(s.charAt(i)-48));
            ans=ans+s.charAt(i-1)+ch;
        }
        if(l%2!=0)
            ans=ans+s.charAt(l-1);
        return ans;
    }
}