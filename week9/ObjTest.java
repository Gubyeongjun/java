package week9;

class D{
	int a, b, c;
	String name;
	
	public D() {
	}
	
	public D(int a) {
		this.a = a;
	}
	
	public D(int a, int b) {
		this(a);
//		this.a = a;
		this.b = b;
	}
	
	public D(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}
	
	public D(int a, int b, String name) {
		this.a = a;
		this.b = b;
		this.name = name;
	}
	
//	int sum() {		return a+b;	}
//	int sum(int c) {		return c + b;	}
//	int sum(int c, int d) {		return c + d;	}
//	int sum(int c, double d) {	return 1; }
//	int sum(double c, int d) {	return 1; }

	void Print() {
		System.out.println("DÅ¬·¡½ºÀÇ °´Ã¼");
	}
}

public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "È«±æµ¿");
		System.out.println("a=" + d.a +" b="+ d.b + " name=" + d.name);
//		System.out.println(d.sum());
//		System.out.println(d.sum(5));
//		System.out.println(d.sum(6,4));
	}
}
