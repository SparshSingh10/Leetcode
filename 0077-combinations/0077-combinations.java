class Solution {
    public List<List<Integer>> combine(int n, int k) {
        boolean[] board =new boolean[n];
        int no_queen=k;
       List<Integer>ll=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
		Combination(board, no_queen, 0,0,ll, ans); 
        return ans;
    }
    
    public static void Combination(boolean[] board, int tq, int qpsf,int idx,List<Integer>ll,List<List<Integer>>ans) {
		if (tq == qpsf) {
          ans.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = idx; i <board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
                ll.add(i+1);
               
				Combination(board, tq, qpsf + 1,i+1,ll,ans);
                 ll.remove(ll.size()-1);
				board[i] = false;// un do
			}

		}
	}

}