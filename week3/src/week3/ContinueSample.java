package week3;

import java.util.Scanner;

public class ContinueSample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.");
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("%d 번째 정수 : ", i+1);
			int num = sc.nextInt();
			if(num < 0)
			{
				continue;
			}
			sum += num;
		}
		System.out.println("입력한 양의 정수의 합은" + sum);
		
		sc.close();
	}
}
