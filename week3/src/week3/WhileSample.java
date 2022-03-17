package week3;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int cnt = 0;	//학생 수
		int scr = 0;	//점수
		int sum = 0;	//총합
		double avr = 0;	//평균
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요(0:종료) : ");
		
		scr = 0;
		while((scr = sc.nextInt()) != 0)
		{
			sum += scr;
			cnt++;
		}
		
		avr = (double)sum / cnt;
		
		System.out.println(cnt + "명의 학생 성적이 입력되었습니다.");
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avr);
		
		sc.close();
	}
}
