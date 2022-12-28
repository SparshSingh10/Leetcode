class Solution {
    public ArrayList<Integer> spiralOrder(int[][] arr) {
        int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int te=arr.length*arr[0].length;
		int count=0;
        ArrayList<Integer> a=new ArrayList<>();
		while(count<te) {
			for(int i=minc;i<=maxc && count<te;i++) {
				a.add(arr[minr][i]);
				count++;
			}
			minr++;
			for(int i=minr;i<=maxr && count<te;i++) {
				a.add(arr[i][maxc]);
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc && count<te;i--) {
				a.add(arr[maxr][i]);
				count++;
			}
			maxr--;
			for(int i=maxr;i>=minr && count<te;i--) {
				a.add(arr[i][minc]);
				count++;
			}
			minc++;
		}
        return a;
    }
}