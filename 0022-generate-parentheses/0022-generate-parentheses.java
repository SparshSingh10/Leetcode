class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> list=new ArrayList<>();
        par(n,0,0,"",list);
        return list;
    }
     public static void par(int n,int op,int clos,String ans,List<String> list) {
        if(op==n && clos==n){
            // System.out.println(ans);
            list.add(ans);
            return;
        }
        if(op<n)
            par(n,op+1,clos,ans+"(",list);
        if(clos<op)
            par(n,op,clos+1,ans+")",list);
    }
}