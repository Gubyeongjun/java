package week11;

import java.util.Iterator;

public class Goodcalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtractor(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
	
	public static void main(String[] args) {
		Goodcalc c = new Goodcalc();
		
		System.out.println(c.add(1, 2));
		System.out.println(c.subtractor(1, 2));
		System.out.println(c.average(new int[] {1,2,3,4}));
	}

}
