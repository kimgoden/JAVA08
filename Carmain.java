package project09;

class Car {
	Tire �����ʾչ��� = new KorTire();
	Tire ���ʾչ��� = new KorTire();
	Tire �����ʵ޹��� = new KorTire();
	Tire ���ʵ޹��� = new KorTire();
	
	void run() {
		�����ʾչ���.roll();
		���ʾչ���.roll();
		�����ʵ޹���.roll();
		���ʵ޹���.roll();

	}
}
public class Carmain {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.run();
		
		
		mycar.�����ʾչ���= new KumhoTire();
		mycar.���ʾչ���= new KumhoTire();
		
		System.out.println();
		mycar.run();


	}
}
