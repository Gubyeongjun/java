package week4;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int IntArray[] = new int[5];
		
		int max = 0;
		int min = 2147483647;
		int sum = 0;
		
		System.out.print("���� ���� �Է� : ");
		
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
		System.out.println("������ "+sum+"�Դϴ�.");
		System.out.println("���� ���� ���� "+min+"�Դϴ�.");
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		
		sc.close();
	}
}
