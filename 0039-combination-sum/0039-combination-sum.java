class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int amount) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        pc(arr,amount,ll,0,ans);
        return ans;
    }
    public static void pc(int[] coin,int amount ,List<Integer> ll,int idx,List<List<Integer>>ans){
        if(amount==0){
           // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i< coin.length;i++){
            if(amount>= coin[i]){
                ll.add(coin[i]);
                pc(coin,amount-coin[i],ll,i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}