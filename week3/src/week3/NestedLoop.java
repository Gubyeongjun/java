package week3;

public class NestedLoop {
	public static void main(String[] args) {
		int i , j = 0;
		
		for(i = 1; i <= 9; i++)
		{
			for(j = 1; j <= 9; j++)
			{
//				System.out.print(i + "*" + j + "=" + i*j);
				System.out.printf("%d*%d=%d", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
