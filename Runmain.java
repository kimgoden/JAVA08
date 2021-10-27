package project09;

public class Runmain {
public static void main(String[] args) {
	Driver driver = new Driver();
	
	bus a = new bus();
	taxi b = new taxi();
	
	driver.drive(a);
	driver.drive(b);
}
}
