
public class OnWater extends Vehicle {
	private int noEngines = 2;
	private double cargoCapacity;

	public OnWater(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}

	public OnWater(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnWater(String serialNumber, int noPersons, String name, int noEngines) {
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
	}

	public OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity) {
		this(serialNumber, noPersons, name, noEngines);
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Sailing the vessel to coordinates: " + "[" + positionX + " , " + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the vessel");
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Vessel properties:\t\n" + 
				"	- serial number: " + super.getSerialNumber() + "\t\n" +
				"	- capacity: " + super.getNoPersons() + " persons\t\n" + 
				"	- name: " + super.getName() + "\t\n" + 
				"Vessel properties:\t\n" + 
				"	- number of engines: " + noEngines + "\t\n" + 
				"	- cargo capacity: " + cargoCapacity );
	}
}
