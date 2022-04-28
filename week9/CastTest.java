package week9;

public class CastTest {
	public static void main(String[] args) {
		
		byte b = 1; int i = 6;
		i = b;
//		b = i;
		b = (byte)i;	//정보손실이 발생하더라고 casting을 하면 된다
		
		SubCls sub = new SubCls(100, 99, 100);
		SupCls sup = new SupCls(95, 89, 100);
		SupCls sup1 = new SubCls();
		Object sup2 = new SubCls();
		
//		SubCls sub2 = new SupCls();
		System.out.println(sub);
		
		SubCls nsub = (SubCls)sup1;
	}
}
