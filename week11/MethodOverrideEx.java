package week11;

abstract class Shape{
	public abstract void draw();
	public void abc(){
		System.out.println("Shape");
	}
}

class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	
	}
	
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverrideEx {
	static void paint(Shape p) {
		p.draw();
	}
	static int calc(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
//		Line l = new Line();
		Rect r = new Rect();
//		paint(l);
		paint(r);

//		calc(1,2);
		
//		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}

