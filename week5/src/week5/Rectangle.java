package week5;

import java.util.Scanner;

public class Rectangle {
	int width, height;
	
	int getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.print("���� : ");
		rect.height = sc.nextInt();
		
		System.out.print("�ʺ� : ");
		rect.width = sc.nextInt();
		
		System.out.println("���� : "+rect.getArea());
		
		sc.close();
	}
	
}
