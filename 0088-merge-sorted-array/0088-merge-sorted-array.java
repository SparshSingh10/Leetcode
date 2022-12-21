public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {   
        if(m == 0 && n > 0) 
        for(int i = 0; i < n; i++)
         nums1[i] = nums2[i];    
        else if(n == 0){     
        }
        else {
            int i=n+m-1,l=m-1,r=n-1;
            while((l>=0&&r>=0) && i>=0){
                if(nums1[l]>nums2[r]) 
                nums1[i--]=nums1[l--];
                else {
                    nums1[i--]=nums2[r--];
                }
            }
           
            if(l<0)
             for(int k=0;k<=i;k++) 
             nums1[k]=nums2[k];
        }
    }
}