package week4;

public class ArrayCall {
	public static int sum(int def[], int n) {
		int sum = 0; 
		def[++n] = 100;
		for (int i = 0; i < def.length; i++) {
			sum += def[i];
		}
		return sum;
	}	//call by value, call by reference
	
	public static void main(String[] args) {
		int abc[] = {1,2,3,4,5};
		int k=3;
		int hap = sum(abc,k);
		
		sum(abc,3);
		for(int i : abc)
		{
			System.out.println(i);
		}
		
		System.out.println(hap);
	}
}
