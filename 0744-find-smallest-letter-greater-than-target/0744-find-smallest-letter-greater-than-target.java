class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;  // Initialize mid outside the while loop
        
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        
        // Wrap around if the target is greater than all letters in the array
        if (start >= arr.length)
            return arr[0];
        
        return arr[end+1];  // Return the next greatest letter
    }
}
