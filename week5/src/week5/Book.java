package week5;

public class Book {
	String t, a;

	public Book(String t, String a) {
		this.t = t;
		this.a = a;
	}
	
	public Book(String t) {
		this.t = t;
		this.a = "¿€¿⁄πÃªÛ";
	}

	public static void main(String[] args) {
		Book littleprince = new Book("æÓ∏∞ø’¿⁄", "Ωﬂ∂º¡„∫£∏Æ");
		Book lovestory = new Book("√·«‚¿¸");
		
		System.out.println(littleprince.t + "\t" + littleprince.a);
		System.out.println(lovestory.t + "\t" + lovestory.a);
	}
}
