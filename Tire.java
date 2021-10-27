package project09;

public interface Tire {
 public void roll();
}

class KorTire implements Tire {
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
class KumhoTire implements Tire {
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}