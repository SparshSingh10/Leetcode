class Solution {
    public int searchInsert(int[] array, int x) {
        int high=array.length-1;
        int low=0;
         while (low <= high) {
      int mid = (high+low) / 2;

      if (array[mid] == x)
        return mid;

      if (array[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return high+1;
  }
}