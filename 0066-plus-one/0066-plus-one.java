class Solution {
    public int[] plusOne(int[] digit) {
        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                return digit;
            }
            digit[i]=0;
                
        }
        digit=new int[digit.length+1];
        digit[0]=1;
        return digit;
        
}
}

    
//     for (int i = digits.length - 1; i >= 0; i--) {
// 	if (digits[i] < 9) {
// 		digits[i]++;
// 		return digits;
// 	}
// 	digits[i] = 0;
// }

// digits = new int[digits.length + 1];
// digits[0] = 1;
// return digits;