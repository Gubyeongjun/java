
class Rect{
	private int w, h, area;
	
	public Rect(int w, int h) {
		super();
		this.w = w;
		this.h = h;
		area = h * w;
	}

	@Override
	public String toString() {
		return "Rect [w=" + w + ", h=" + h + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(area == r.area) {
			return true;
		}
		else {
			return false;
		}
	}	
}

public class RectEx {
	public static void main(String[] args) {
		Rect r1 = new Rect(2,3);
		Rect r2 = new Rect(3,2);
		
		if(r1.equals(r2)) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.MAX_VALUE);
	}
}
