package week3;

public class For_ex1 {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		for (i = 1; i <= 10; i++)
		{
			System.out.print(i);
			sum += i;
			
			if(i<=9)
			{
				System.out.print("+");
			}
			else
			{
				System.out.print("=");
			}
		}
		System.out.println(sum);
	}
}
