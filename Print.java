package project09;

public interface Print {
void print();
	
}

class samsungPrint implements Print{

	@Override
	public void print() {
		System.out.println("삼성 프린터");
		System.out.println("자바 이론 문서를 인쇄합니다.");
	}
	
}
class lgPrint implements Print{
	public void print() {
		System.out.println("삼성 프린터");
		System.out.println("자바 이론 문서를 인쇄합니다.");
	}
}