package project09;

public class TAXI01  implements Vehiclable{
	private int speed;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ýð�" + this.speed + "km�� �޸��ϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ýð� ����ϴ�.");
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


