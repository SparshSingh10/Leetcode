class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int amount) {
        Arrays.sort(arr);
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
            if(i!=idx && coin[i]==coin[i-1])
                continue;
            if(amount>= coin[i]){
                ll.add(coin[i]);
                pc(coin,amount-coin[i],ll,i+1,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}