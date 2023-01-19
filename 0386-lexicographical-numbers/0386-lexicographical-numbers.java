class Solution {
    List<Integer> list = new ArrayList<>();
    
    private void addAllLexico(int num,int n){
        if(num > n){
            return;
        }
        
        list.add(num);
        
        for(int i = 0; i <= 9;i++){
            addAllLexico(num * 10 + i,n);
        }
    }
    
    public List<Integer> lexicalOrder(int n) {
        for(int i = 1;i <= 9;i++){
            addAllLexico(i,n);
        }
        return list;
    }
}