class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=' '+s;
        int c=0;
            for(int i=s.length()-1;i>0;i--){
                char ch=s.charAt(i);
                if(ch==' ')
                    break;
                else
                    c++;
            }
        return c;
}
}