class Solution {
    public boolean isPerfectSquare(int n) {

        long left = 1;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid*mid == n) {
                return true;  // Square root found
            }

            if (mid*mid > n) {
                right = mid - 1;  // Search in the left half
            } else {
                left = mid + 1;  // Search in the right half
            }
        }

        return false;  // Return the floor value of the square root
    }
}
