package project09;

public interface newPrinter {
	void print(String doc);

}
interface ColorPrintable extends newPrinter{
	void printCMYK(String doc);
}
class SamPrint implements ColorPrintable{

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ������");
		System.out.println(doc + "�� �μ��մϴ�.");
	}

	@Override
	public void printCMYK(String doc) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ������");
		System.out.println("�÷�" + doc + "�� �μ��մϴ�.");
	}
	
}
class hellgPrint implements newPrinter{

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("���� ������");
		System.out.println(doc + "�� �μ��մϴ�.");
	}
	
}
	
