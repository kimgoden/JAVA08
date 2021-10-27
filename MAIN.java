package project09;

public class MAIN {
public static void main(String[] args) {
	implementC impl = new implementC();
	A ia = impl;
	ia.methodA();
System.out.println();

   B ib = impl;
   ib.methodB();
   System.out.println();
   
   C ic = impl;
   ic.methodC();
   ic.methodA();
   ic.methodB();
   
}
}
