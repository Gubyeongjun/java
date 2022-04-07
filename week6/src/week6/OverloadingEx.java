package week6;

class MethodSample{
	int olEx(int i, int j) {
		return i + j;
	}
	int olEx(int i, int j, int k) {
		return i + j + k;
	}
	double olEx(double i, double j) {
		return i + j;
	}
	double olEx(double i, int j) {
		return i + j;
	}
	double olEx(int i, double j) {
		return i + j;
	}
	 /*double olEx(int i , int j) {
		return i + j;
	}*/	//프로토타입이 달라도(데이터 기본타입) 시그니처가 같으면 메소드 오버로딩이 안됨.
}

public class OverloadingEx {

}
