package project09;

public class MAIN02_implements implements MAIN02 {


	@Override
	public void makethis() {
		System.out.println("make this 메서드 실행");
		
	}

	@Override
	public void makethiswith(String name, int age) {
		System.out.println("with 메서드실행, 매개변수 :" + name + "," + age);
		
	}

}
