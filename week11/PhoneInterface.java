package week11;

public interface PhoneInterface {
	/*public static final*/ int TIMEOUT = 10000;
	/*public abstract*/ void sendcall();
	/*public abstract*/ void receivecall();
	/*public*/ default void printLogo() {
		System.out.println("*** Phone ***");
	}	//����Ʈ �޼ҵ�
	default void printLogo1() {
		System.out.println("*** Phone1 ***");
	}
}
