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
		
		System.out.print("높이 : ");
		rect.height = sc.nextInt();
		
		System.out.print("너비 : ");
		rect.width = sc.nextInt();
		
		System.out.println("면적 : "+rect.getArea());
		
		sc.close();
	}
	
}
