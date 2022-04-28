package week9;

public class SubCls extends SupCls{
	int sum;
	double avg;
	String addr;
	
	public SubCls() {
		sum = kor + eng + math;
	}
	public SubCls(int kor, int eng, int math) {
		super(kor, eng, math);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum = kor + eng + math;
		avg = sum / 3.0;
	}
	@Override
	public String toString() {
		return "kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg;
	}
	
}
