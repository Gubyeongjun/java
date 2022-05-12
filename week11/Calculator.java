package week11;

public abstract class Calculator {
	int a, b;
	public abstract int add(int a, int b);
	public abstract int subtractor(int a, int b);
	public abstract double average(int[] a);
	
	public void printInfo() {
		System.out.println("추상 메소드가 아닌 일반 메소드.");
	}
}
