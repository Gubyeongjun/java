package week9;

class A {
	public A() {
		System.out.println("持失切A");
	}
	public A(int a) {
		System.out.println("持失切 Aa");
	}
}

class B extends A{
	public B() {
		System.out.println("持失切B");
	}
	public B(int b) {
		super(b);
		System.out.println("持失切 Bb");
	}
}

class C extends B{
	public C() {
		System.out.println("持失切C");
	}
	public C(int c) {
		super(c);
		System.out.println("持失切 Cc");
	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		C c = new C(1);
	}
}	
