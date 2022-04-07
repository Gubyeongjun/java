package week6;

class Circle{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		
		Circle[] c = new Circle[5];
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new Circle(i);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println((c[i].getArea() + " "));
		}
		
	}
}
