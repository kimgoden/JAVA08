package project09;

class Car {
	Tire ¿À¸¥ÂÊ¾Õ¹ÙÄû = new KorTire();
	Tire ¿ŞÂÊ¾Õ¹ÙÄû = new KorTire();
	Tire ¿À¸¥ÂÊµŞ¹ÙÄû = new KorTire();
	Tire ¿ŞÂÊµŞ¹ÙÄû = new KorTire();
	
	void run() {
		¿À¸¥ÂÊ¾Õ¹ÙÄû.roll();
		¿ŞÂÊ¾Õ¹ÙÄû.roll();
		¿À¸¥ÂÊµŞ¹ÙÄû.roll();
		¿ŞÂÊµŞ¹ÙÄû.roll();

	}
}
public class Carmain {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.run();
		
		
		mycar.¿À¸¥ÂÊ¾Õ¹ÙÄû= new KumhoTire();
		mycar.¿ŞÂÊ¾Õ¹ÙÄû= new KumhoTire();
		
		System.out.println();
		mycar.run();


	}
}
