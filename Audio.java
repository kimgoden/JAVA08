package project09;

class Audio implements RemoteControl {
private int volume;

@Override
public void turnOn() {
	// TODO Auto-generated method stub
	System.out.println("������� �մϴ�.");
}

@Override
public void turnOff() {
	// TODO Auto-generated method stub
	System.out.println("������� ���ϴ�.");
}

public void setvolume(int volume) {
	// TODO Auto-generated method stub
	if(volume > RemoteControl.max_volume) {
		this.volume = RemoteControl.max_volume;
	} else if(volume < RemoteControl.min_volume) {
		this.volume = RemoteControl.min_volume;
	}else this.volume =volume;
	System.out.println("���� ����� ������" + this.volume);
}

	
}
class TV implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�.");
	}

	public void setvolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.max_volume) {
			this.volume = RemoteControl.max_volume;
		} else if(volume < RemoteControl.min_volume) {
			this.volume = RemoteControl.min_volume;
		}else this.volume =volume;
		System.out.println("���� TV ������" + this.volume);
	}

		
	}
