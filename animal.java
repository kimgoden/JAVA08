package project09;

public abstract class animal {
public String kind;

public animal(String kind) {
	this.kind = kind;
}
public void breathe() {
	System.out.println("¼ûÀ» ½±´Ï´Ù.");
}
public abstract void sound();
}

class Cat extends animal {
	public Cat() {
		super("°í¾çÀÌ");
	}
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
}
class Dog extends animal {
	public Dog() {
		super("°­¾ÆÁö");
	}
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}