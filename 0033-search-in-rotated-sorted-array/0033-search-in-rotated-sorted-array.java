class Solution 
{
    public int search(int[] nums, int target) 
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
        if(ans!=-1)
            return ans;
        return bin(nums,k,nums.length-1,target);
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