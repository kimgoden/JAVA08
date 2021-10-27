package project09;

class MAIN02_implements implements MAIN02 {


	@Override
	public void makethis() {
		System.out.println("make this 메서드 실행");
		
	}

	@Override
	public void makethiswith(String name, int age) {
		System.out.println("with 메서드실행, 매개변수 :" + name + "," + age);
		
	}

}
public class MAIN02_MAIN {
public static void main(String [] args) {
	String name = "형준";
	int age = 27;
	MAIN02_implements mi = new MAIN02_implements();
	mi.makethis();
	mi.makethiswith(name, age);
	
	
}
}
