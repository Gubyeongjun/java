package week11;

public class SmartPhone extends Calc implements PhoneInterface{
	
	@Override
	public void sendcall() {
		System.out.println("�츮��");
	}

	@Override
	public void receivecall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void schedule() {
		System.out.println("���� ������ �մϴ�.");
	}
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendcall();
		System.out.println("3�� 5�� ���ϸ�"+ phone.calculate(3, 5));
		phone.schedule();
	}
}
