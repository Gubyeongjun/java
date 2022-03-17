package week3;

import java.util.Scanner;

public class ContinueSample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("정수 5개를 입력하세요.");
		
		int i = 1;
		while(i <= 5)
		{
			System.out.print(i + "번째 정수 : ");
			int num = sc.nextInt();
			if(num < 0)
			{
				i++;
				continue;
			}
			sum += num;
			i++;
		}
		
		System.out.println("입력한 양의 정수의 합 = " + sum);
		
		sc.close();
	}
}
