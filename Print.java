package project09;

public interface Print {
void print();
	
}

class samsungPrint implements Print{

	@Override
	public void print() {
		System.out.println("�Ｚ ������");
		System.out.println("�ڹ� �̷� ������ �μ��մϴ�.");
	}
	
}
class lgPrint implements Print{
	public void print() {
		System.out.println("�Ｚ ������");
		System.out.println("�ڹ� �̷� ������ �μ��մϴ�.");
	}
}