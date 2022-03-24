package week4;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int IntArray[] = new int[5];
		
		int max = 0;
		int min = 2147483647;
		int sum = 0;
		
		System.out.print("양의 정수 입력 : ");
		
		for (int i = 0; i < IntArray.length; i++) {
			IntArray[i] = sc.nextInt();
			sum += IntArray[i];
			if(IntArray[i] > max)
			{
				max = IntArray[i];
			}
			if(IntArray[i] < min)
			{
				min = IntArray[i];
			}
		}
		System.out.println("총합은 "+sum+"입니다.");
		System.out.println("가장 작은 수는 "+min+"입니다.");
		System.out.println("가장 큰 수는 "+max+"입니다.");
		
		sc.close();
	}
}
