package week6;

public class ArrayPassing {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		increase(a);
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
	}
	static void increase(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
}
