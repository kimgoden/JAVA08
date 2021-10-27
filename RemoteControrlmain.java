package project09;

public class RemoteControrlmain {
public static void main(String[] args) {
	RemoteControl rc;
	RemoteControl tv;
	rc = new Audio();
	tv = new TV();
	
	rc.turnOn();
	rc.setvolume(6);
	rc.turnOff();
	tv.turnOn();
	tv.setvolume(3);
	tv.turnOff();

	
}
}

