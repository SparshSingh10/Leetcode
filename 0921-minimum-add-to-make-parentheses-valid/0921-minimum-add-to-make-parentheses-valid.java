

public class Solution {
    public int minAddToMakeValid(String S) {
        int openCount = 0;
        int addCount = 0;

        for (char c : S.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount > 0) {
                    openCount--;
                } else {
                    addCount++;
                }
            }
        }

        return addCount + openCount;
    }

   
}
