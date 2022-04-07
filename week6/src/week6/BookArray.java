package week6;

import java.util.Scanner;

class Book{
	String author, title;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		Book [] b = new Book[2];
		
		for(int i = 0; i < b.length; i ++)
		{
			System.out.print("제목");
			String title = sc.next();
			System.out.print("저자");
			String author = sc.next();
			
			b[i] = new Book(title, author);
		}
		
		for(int i = 0; i < b.length; i++)
		{
			System.out.println(b[i].title +" "+ b[i].author);
		}
		
		sc.close();
	}
}
