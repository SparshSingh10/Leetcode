/* Time complexity is O(nlog(n)) */
class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }
        
        k = k % n;
        
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
/* Time complexity is O(n*2) */
/*class Solution { 
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n || k<n ){
            k = k%n;
            for(int i=0;i<k;i++){
                for(int j=n-1;j>0;j--){
                    Swap(nums,j,j-1);
                    }
            }
        }
    }
    public static void Swap( int arr[],int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
*/