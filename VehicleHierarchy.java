package assignment10;

public class VehicleHierarchy {
public void start() {
	System.out.println("Vehicle is starting");

}
public void stop() {
	System.out.println("Vehicle is stoping");
}
}
class car extends VehicleHierarchy{
	@Override
	public void start() {
		System.out.println("car is started");

	}
	@Override
	public void stop() {
		System.out.println("car is stoping");
		super.stop();
	}
}
class Cycle extends VehicleHierarchy {
	@Override
	public void start() {
		System.out.println("cycle is started");
		super.start();
	}
	@Override
	public void stop() {
		System.out.println("cycle is stoped");
		super.stop();
	}
}
class Main{
	public static void main(String[] args) {
		VehicleHierarchy c=new car();
		VehicleHierarchy cycle=new Cycle();
		c.start();
		c.stop();
		cycle.start();
		cycle.stop();
	}
}