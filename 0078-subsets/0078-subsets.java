class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        pc(nums,0,ll,ans);
        return ans;
    }
    public static void pc(int[] arr,int i, List<Integer> ll,List<List<Integer>>ans){
        if(i==arr.length){
            ans.add(new ArrayList<Integer>(ll));
            return;
        }
        pc(arr,i+1,ll,ans);
        ll.add(arr[i]);
        pc(arr,i+1,ll,ans);
        ll.remove(ll.size()-1);
    }
}