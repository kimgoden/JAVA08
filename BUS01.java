package project09;

public class BUS01 implements Vehiclable{
private int speed;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������" + this.speed + "km�� �޸��ϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ����ϴ�.");
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if(speed < 0) {
			System.out.println("�ӵ��� �����ϸ��� ������");
			return;
		}
		this.speed = speed;
	}

}
