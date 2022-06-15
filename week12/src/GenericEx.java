
/*class IntCls{
	Integer a;
	
	public void print() {
		System.out.println(a);
	}
}

class DblCls{
	Double a;
	
	public void print() {
		System.out.println(a);
	}
}

class LonCls{
	Long a;
	public void print() {
		System.out.println(a);
	}
}*/

class GenCls<T>{
	T a;
	public void print() {
		System.out.println(a);
	}
}

public class GenericEx {
	public static void main(String[] args) {
		
		/*GenCls<Integer> g = new GenCls();*/
		
		GenCls<Integer> i = new GenCls<Integer>();
		i.print();
		GenCls<Double> d = new GenCls<Double>();
		d.print();
		GenCls<Long> l = new GenCls<Long>();
		l.print();
		GenCls<String> s = new GenCls<String>();
		s.print();
	}
}
