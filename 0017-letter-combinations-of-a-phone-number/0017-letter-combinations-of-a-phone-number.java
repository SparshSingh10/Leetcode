class Solution {
     static String[] key = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>lis=new ArrayList<>();
         if (digits.length() != 0) {
            key(digits, "", lis);
        }
        return lis;
    }
     public static void key(String ques,String ans,List<String> lis) {
        if(ques.length()==0){
            lis.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=key[ch-48];
       for (int i = 0; i < press.length(); i++) {
        key(ques.substring(1), ans+press.charAt(i),lis);
        
       }
    }
}