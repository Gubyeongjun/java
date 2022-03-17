package week3;

public class While_ex1 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		i =1;
		while(i<=10)
		{
			sum += i;
			System.out.print(i);
			
			
			if(i<=9)
			{
				System.out.print("+");
			}
			else
			{
				System.out.print("=");
				System.out.print(sum);
			}
			
			i++;
		}
		
		
	}
}
