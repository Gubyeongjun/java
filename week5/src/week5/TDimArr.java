package week5;

public class TDimArr {
	public static void main(String[] args) {
		int [] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int [][] arr2 = new int[3][5];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		int [][][] arr3 = new int [2][3][5];
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				for (int j2 = 0; j2 < arr3[0][0].length; j2++) {
					System.out.println(arr3[i][j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		int [][][][] arr4 = new int [2][2][3][5];
		
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[0].length; j++) {
				for (int j2 = 0; j2 < arr4[0][0].length; j2++) {
					for (int k = 0; k < arr4[0][0][0].length; k++) {
						System.out.println(arr4[i][j][j2][k] + " ");
					}
				}
			}
		}
	}
}
