package project09;

public interface Run {
 public void run();
}

class bus implements Run {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������ �޸��ϴ�");
	}
	
}
class taxi implements Run {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ýð� �޸��ϴ�");
	}
	
	
}