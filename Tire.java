package project09;

public interface Tire {
 public void roll();
}

class KorTire implements Tire {
	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�.");
	}
}
class KumhoTire implements Tire {
	public void roll() {
		System.out.println("��ȣ Ÿ�̾ �������ϴ�.");
	}
}