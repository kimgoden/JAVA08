package project09;

public abstract class animal {
public String kind;

public animal(String kind) {
	this.kind = kind;
}
public void breathe() {
	System.out.println("���� ���ϴ�.");
}
public abstract void sound();
}

class Cat extends animal {
	public Cat() {
		super("�����");
	}
	public void sound() {
		System.out.println("�߿�");
	}
}
class Dog extends animal {
	public Dog() {
		super("������");
	}
	public void sound() {
		System.out.println("�۸�");
	}
}