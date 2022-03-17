package week3;

public class BreakSample2 {
	public static void main(String[] args) {
		
		abc:	//for구문 이름
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if((i+j) == 6)
				{
					break abc;
				}
				System.out.print("i=" + i + ", j=" + j);
				System.out.print("\t");
				 
			}
			System.out.println();
		}
		System.out.println("종료");
		
	}
}
