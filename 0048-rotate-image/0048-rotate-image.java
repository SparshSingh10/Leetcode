class Solution {
    public void rotate(int[][] arr) {
        Transpose(arr);
		for(int i=0;i<arr.length;i++) {
		ReverseArray(arr[i]);
		}
    }
    public static void Transpose(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
	}
    public static void ReverseArray(int []arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
}