class Solution 
{
    public int rob(int[] nums)
    {
        int[] dp=new int[nums.length];
        
        int n=nums.length;
        
        Arrays.fill(dp,-1);
        
        return solve(nums,n-1,dp);
    }
    private int solve(int[] nums,int n,int[] dp)
    {
        if(n<0)
            return 0;
        if(n==0)
            return nums[0];
        if(dp[n]!=-1)
            return dp[n];
        int inc=solve(nums,n-2,dp)+nums[n];
        
        int ex=solve(nums,n-1,dp)+0;
        
        dp[n]=Math.max(inc,ex);
        
        return dp[n];
    }
}