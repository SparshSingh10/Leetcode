class Solution 
{
    public boolean search(int[] nums, int target) 
    {
        int k=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                k=i+1;
                break;
            }
        }
        
        int ans=bin(nums,0,k-1,target);
        
        if(ans>=0)
            return true;
        int a1= bin(nums,k,nums.length-1,target);
        if(a1>=0)
            return true;
        return false;
    }
    private int bin(int[] nums,int left,int right,int target)
    {
        int i=left;
        int j=right;
        while(i<=j)
        {
            int mid=(i+j)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                j=mid-1;
            else
                i=mid+1;
        }
        return -1;
    }
}