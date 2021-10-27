package project09;

public class animalmain {
public static void main(String[] args) {
	

	
	Dog dog = new Dog();
	Cat cat = new Cat();
	
	dog.sound();
	cat.sound();
	animal Animal = null;
	
	Animal = new Dog();
	Animal.sound();
	
	Animal = new Cat();
	Animal.sound();
}
}