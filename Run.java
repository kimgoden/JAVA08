package project09;

public interface Run {
 public void run();
}

class bus implements Run {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다");
	}
	
}
class taxi implements Run {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("택시가 달립니다");
	}
	
	
}