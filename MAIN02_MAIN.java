package project09;

class MAIN02_implements implements MAIN02 {


	@Override
	public void makethis() {
		System.out.println("make this �޼��� ����");
		
	}

	@Override
	public void makethiswith(String name, int age) {
		System.out.println("with �޼������, �Ű����� :" + name + "," + age);
		
	}

}
public class MAIN02_MAIN {
public static void main(String [] args) {
	String name = "����";
	int age = 27;
	MAIN02_implements mi = new MAIN02_implements();
	mi.makethis();
	mi.makethiswith(name, age);
	
	
}
}
