class Solution {
    public int searchInsert(int[] array, int x) {
        int high=array.length;
        int low=0;
        while(low<high){
           int mid = low + (high - low) / 2;
            if(array[mid]==x)
                return mid;
            else if(array[mid]>x)
               high=mid;
            else
                low=mid+1;
        }
        return low;
}
}