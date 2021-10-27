package project09;

class DRIVER {
	public void 드라이브(Vehiclable vehiclable) {
	vehiclable.run();
}
	public void stop(Vehiclable vehiclable) {
	vehiclable.stop();
	
	
}

	public Vehiclable NEWCARMETHOD(Vehiclable vehiclable) {
		if(vehiclable instanceof TAXI01) {
		 TAXI01 taxi = (TAXI01)vehiclable;
		 return taxi;
		 
		}else if(vehiclable instanceof BUS01) {
		 BUS01 bus = (BUS01)vehiclable;
		 return bus;
		}
		return null;
		
	}		
}
	public class Vehiclablemain {
public static void main(String[] args) {
	
	DRIVER driver = new DRIVER();
	BUS01 bus = new BUS01();
	TAXI01 taxi = new TAXI01();
	
	bus.setSpeed(-50);
	bus.setSpeed(80);
	driver.드라이브(bus);
	driver.stop(bus);
  }
}
