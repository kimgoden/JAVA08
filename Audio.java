package project09;

class Audio implements RemoteControl {
private int volume;

@Override
public void turnOn() {
	// TODO Auto-generated method stub
	System.out.println("오디오를 켭니다.");
}

@Override
public void turnOff() {
	// TODO Auto-generated method stub
	System.out.println("오디오를 끕니다.");
}

public void setvolume(int volume) {
	// TODO Auto-generated method stub
	if(volume > RemoteControl.max_volume) {
		this.volume = RemoteControl.max_volume;
	} else if(volume < RemoteControl.min_volume) {
		this.volume = RemoteControl.min_volume;
	}else this.volume =volume;
	System.out.println("현재 오디오 볼륨은" + this.volume);
}

	
}
class TV implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	public void setvolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.max_volume) {
			this.volume = RemoteControl.max_volume;
		} else if(volume < RemoteControl.min_volume) {
			this.volume = RemoteControl.min_volume;
		}else this.volume =volume;
		System.out.println("현재 TV 볼륨은" + this.volume);
	}

		
	}
