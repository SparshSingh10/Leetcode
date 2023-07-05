class Solution {
    public int mySqrt(int n) {
        if (n == 0) {
            return 0;
        }

        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqrt = n / mid;

            if (sqrt == mid) {
                return mid;  // Square root found
            }

            if (sqrt < mid) {
                right = mid - 1;  // Search in the left half
            } else {
                left = mid + 1;  // Search in the right half
            }
        }

        return right;  // Return the floor value of the square root
    }
}
