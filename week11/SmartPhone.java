package week11;

public class SmartPhone extends Calc implements PhoneInterface{
	
	@Override
	public void sendcall() {
		System.out.println("띠리링");
	}

	@Override
	public void receivecall() {
		System.out.println("전화가 왔습니다.");
	}
	
	public void schedule() {
		System.out.println("일정 관리를 합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendcall();
		System.out.println("3과 5를 더하면"+ phone.calculate(3, 5));
		phone.schedule();
	}
}
