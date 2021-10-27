package project09;

public class Printmain {
public static void main(String[] args) {
	Print LG;
	Print SAMSUNG;
	LG = new lgPrint();
	SAMSUNG = new samsungPrint();
	
	SAMSUNG.print();
	LG.print();
}
}
