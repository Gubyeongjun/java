package week3;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int cnt = 0;	//�л� ��
		int scr = 0;	//����
		int sum = 0;	//����
		double avr = 0;	//���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0:����) : ");
		
		scr = 0;
		while((scr = sc.nextInt()) != 0)
		{
			sum += scr;
			cnt++;
		}
		
		avr = (double)sum / cnt;
		
		System.out.println(cnt + "���� �л� ������ �ԷµǾ����ϴ�.");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avr);
		
		sc.close();
	}
}
