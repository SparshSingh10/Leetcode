class Solution {
    public int addDigits(int n) {
        int r;
        while(n>9){
            int s=0;
        while(n!=0){
            r=n%10;
            s=s+r;
            n=n/10;
        }
            n=s;
        }
            return n;
    }
}