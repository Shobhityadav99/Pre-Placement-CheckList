package prePlacementCheckList;

public class rotateby90Degreemethod2 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
        		{ 5, 6, 7, 8 },
        		{ 9, 10, 11, 12 },
        		{ 13, 14, 15, 16 } };
	rotate(arr,4);
	}
	
	static void rotate(int arr[][],int n) {
		for(int j=0;j<n;j++) {
			for(int i=n-1;i>=0;i--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
