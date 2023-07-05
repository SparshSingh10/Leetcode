class Solution {
    public int peakIndexInMountainArray(int[] arr) {
          int left = 0;
        while (arr[left] < arr[left+1]) 
            left++;
        return left;
    }
}