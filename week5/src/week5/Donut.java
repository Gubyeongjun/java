package week5;

public class Donut {
	int radius;
	String name;
	double getArea() {
		double area;
		area = 3.14 * radius * radius;
		return area;
	}
	public static void main(String[] args) {
		Donut pizza = new Donut();
		
		pizza.name = "�ڹ�����";
		pizza.radius = 5;
		
		System.out.println(pizza.name + " ���� : " + pizza.getArea());
		
		Donut donut = new Donut();
		
		donut.name = "�ڹٵ���";
		donut.radius = 2;
		
		System.out.println(donut.name + " ���� : " + donut.getArea());
	}
}
