package project09;

public class BUS01 implements Vehiclable{
private int speed;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가" + this.speed + "km로 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("버스가 멈춥니다.");
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if(speed < 0) {
			System.out.println("속도가 음수일리가 업군요");
			return;
		}
		this.speed = speed;
	}

}
